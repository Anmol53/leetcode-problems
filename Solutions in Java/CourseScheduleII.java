class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        Graph g = new Graph(numCourses);
        for(int [] x : prerequisites){
            g.addEdge(x[1], x[0]);
        }
        return g.topologicalSort();
    }
}
class Graph {
    int v;
    List<List<Integer>> e;
    Graph(int v){
        this.v = v;
        e = new ArrayList<>();
        for(int i = 0; i < v; i++){
            e.add(new ArrayList<Integer>());
        }
    }
    void addEdge(int a, int b){
        e.get(a).add(b);
    }
    int[] topologicalSort(){
        for(List<Integer> l : e){
            System.out.println(l);
        }
        boolean visited[] = new boolean[v];
        Arrays.fill(visited, false);
        Stack<Integer> order = new Stack<>();
        Set<Integer> hs = new HashSet<Integer>();
        for(int i = 0; i < v; i++){
            if(!visited[i]){
                boolean isCycle = tSUtil(visited, order, hs, i);
                if(isCycle){
                    return new int[0];
                }
            }
        }
        int ans[] = new int[v];
        int i = 0;
        while(!order.empty()){
            ans[i] = order.pop();
            i++;
        }
        return ans;
    }
    boolean tSUtil(boolean visited[], Stack<Integer> order, Set<Integer> hs, int ver){
        if(hs.contains(ver)){
            return true;
        }
        hs.add(ver);
        visited[ver] = true;
        for(int x : e.get(ver)){
            if(hs.contains(x)){
                return true;
            }
            if(!visited[x]){
                boolean isCycle = tSUtil(visited, order, hs, x);
                if(isCycle){
                    return true;
                }
            }
        }
        hs.remove(ver);
        order.push(ver);
        return false;
    }
}