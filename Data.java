import java.util.*;

interface Data {
    public void showpush(Stack st, int a);

    public void showpop(Stack st);

    public void operation();

    public int getNodeId();

    public void LinkedList_insert();

    class stack<T> implements Data {

        public class  {

            int data;
            Node next;

            // Constructor
            Node(int d) {
                data = d;
                next = null;
            }
        }

        @Override
        public void showpush(Stack st, int a) {

            st.push(new Integer(a));
            System.out.println("push(" + a + ")");
            System.out.println("stack: " + st);
        }

        @Override
        public void showpop(Stack st) {
            System.out.print("pop -> ");
            Integer a = (Integer) st.pop();
            System.out.println(a);
            System.out.println("stack: " + st);
        }

        public void operation() {
            Queue<Integer> q = new LinkedList<>();
            q.add(6);
            q.add(1);
            q.add(8);
            q.add(4);
            q.add(7);
            System.out.println("The queue is: " + q);
            int num1 = q.remove();
            System.out.println("The element deleted from the head is: " + num1);
            System.out.println("The queue after deletion is: " + q);
            int head = q.peek();
            System.out.println("The head of the queue is: " + head);
            int size = q.size();
            System.out.println("The size of the queue is: " + size);
        }

        @Override
        public int getNodeId() {
            return 0;
        }

        @Override
        public void LinkedList_insert() {
            LinkedList<String> animals = new LinkedList<>();

            // Add elements to LinkedList
            animals.add("Dog");
            animals.add("Cat");
            animals.add("Horse");
            System.out.println("LinkedList: " + animals);
        }



        static class Example {
            public static void main(String[] args) {
                // stack<Integer> isack = new stack<Integer>();
                stack isack = new stack();
                Stack st = new Stack<>();
                System.out.println("stack: " + st);
                isack.showpush(st, 42);
                isack.showpush(st, 66);
                isack.showpush(st, 99);
                isack.showpop(st);
                isack.showpop(st);
                isack.showpop(st);
                try {
                    isack.showpop(st);
                } catch (EmptyStackException e) {
                    System.out.println("empty stack");
                }
                isack.operation();
                isack.LinkedList_insert();
                // Object of graph is created.
                Graph<Integer> g = new Graph<Integer>();

                // edges are added.
                // Since the graph is bidirectional,
                // so boolean bidirectional is passed as true.
                g.addEdge(0, 1, true);
                g.addEdge(0, 4, true);
                g.addEdge(1, 2, true);
                g.addEdge(1, 3, true);
                g.addEdge(1, 4, true);
                g.addEdge(2, 3, true);
                g.addEdge(3, 4, true);

           import java.util.*;

                interface Data {
                    public void showpush(Stack st, int a);

                    public void showpop(Stack st);

                    public void operation();

                    public int getNodeId();

                    public void LinkedList_insert();

                    class stack<T> implements Data {

                        public class Node {

                            int data;
                            Node next;

                            // Constructor
                            Node(int d) {
                                data = d;
                                next = null;
                            }
                        }

                        @Override
                        public void showpush(Stack st, int a) {

                            st.push(new Integer(a));
                            System.out.println("push(" + a + ")");
                            System.out.println("stack: " + st);
                        }

                        @Override
                        public void showpop(Stack st) {
                            System.out.print("pop -> ");
                            Integer a = (Integer) st.pop();
                            System.out.println(a);
                            System.out.println("stack: " + st);
                        }

                        public void operation() {
                            Queue<Integer> q = new LinkedList<>();
                            q.add(6);
                            q.add(1);
                            q.add(8);
                            q.add(4);
                            q.add(7);
                            System.out.println("The queue is: " + q);
                            int num1 = q.remove();
                            System.out.println("The element deleted from the head is: " + num1);
                            System.out.println("The queue after deletion is: " + q);
                            int head = q.peek();
                            System.out.println("The head of the queue is: " + head);
                            int size = q.size();
                            System.out.println("The size of the queue is: " + size);
                        }

                        @Override
                        public int getNodeId() {
                            return 0;
                        }

                        @Override
                        public void LinkedList_insert() {
                            LinkedList<String> animals = new LinkedList<>();

                            // Add elements to LinkedList
                            animals.add("Dog");
                            animals.add("Cat");
                            animals.add("Horse");
                            System.out.println("LinkedList: " + animals);
                        }



                        static class Example {
                            public static void main(String[] args) {
                                // stack<Integer> isack= new stack<Integer>();
                                stack isack = new stack();
                                Stack st = new Stack<>();
                                System.out.println("stack: " + st);
                                isack.showpush(st, 42);
                                isack.showpush(st, 66);
                                isack.showpush(st, 99);
                                isack.showpop(st);
                                isack.showpop(st);
                                isack.showpop(st);
                                try {
                                    isack.showpop(st);
                                } catch (EmptyStackException e) {
                                    System.out.println("empty stack");
                                }
                                isack.operation();
                                isack.LinkedList_insert();
                                // Object of graph is created.
                                Graph<Integer> g = new Graph<Integer>();

                                // edges are added.
                                // Since the graph is bidirectional,
                                // so boolean bidirectional is passed as true.
                                g.addEdge(0, 1, true);
                                g.addEdge(0, 4, true);
                                g.addEdge(1, 2, true);
                                g.addEdge(1, 3, true);
                                g.addEdge(1, 4, true);
                                g.addEdge(2, 3, true);
                                g.addEdge(3, 4, true);

                                // print the graph.
                                System.out.println("Graph:\n"
                                        + g.toString());

                                // gives the no of vertices in the graph.
                                g.getVertexCount();

                                // gives the no of edges in the graph.
                                g.getEdgesCount(true);

                                // tells whether the edge is present or not.
                                g.hasEdge(3, 4);

                                /* tells whether vertex is present or not */
                                g.hasVertex(5);
                            }


                        }
                    }
                }











                // print the graph.
                System.out.println("Graph:\n"
                        + g.toString());

                // gives the no of vertices in the graph.
                g.getVertexCount();

                // gives the no of edges in the graph.
                g.getEdgesCount(true);

                // tells whether the edge is present or not.
                g.hasEdge(3, 4);

                /* tells whether vertex is present or not */
                g.hasVertex(5);
            }


        }
    }
}











