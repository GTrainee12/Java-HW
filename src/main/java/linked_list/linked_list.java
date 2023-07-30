package linked_list;



import java.util.Iterator;

public class linked_list {
    public static void main(String[] args) {
        SingleLinkList <Toys> ToysList = new SingleLinkList<>();
        ToysList.addToEnd(new Toys(1, "Teddy Bear", 22));
        ToysList.addToEnd(new Toys(2, "Legos", 20));
        ToysList.addToEnd(new Toys(3, "Dollhouse",12));

        for (Toys size : ToysList) {
            System.out.println(size);
        }

        ToysList.reverse();
        System.out.println("_______________________________________________________________________");

        for (Toys size : ToysList) {
            System.out.println(size);
        }

    }
    static class Toys{
        int id;
        String name;
        int size;
        public Toys (int id, String name, int size){
            this.id = id;
            this.name = name;
            this.size = size;
        }
        @Override
        public String toString(){
            return "Toys{" +
                    "id=" + id +
                    ", Name='" + name + '\''+
                    ", Size='" + size + '\''+
                    '}';
        }

    }


        public static class SingleLinkList<T> implements Iterable<T> {

        Node<T> first;
        Node<T> last;

            @Override
            public Iterator<T> iterator() {
                return new Iterator<T>() {
                    Node<T> current = first;

                    @Override
                    public boolean hasNext() {
                        return current != null;
                    }

                    @Override
                    public T next() {
                        T data = current.data;
                        current = current.next;
                        return data;
                    }
                };
            }

            private static class Node<T> {
                T data;
                Node<T> next;
            }
            public boolean isEmpty(){
                return first == null;
            }

            public void addToEnd(T item) {
                Node<T> newItem = new Node<>();
                newItem.data = item;
                if (isEmpty()) {
                    first = newItem;
                    last = newItem;
                } else {
                    last.next = newItem;
                    last = newItem;
                }
            }
            public void reverse(){
                if (!isEmpty()&& first.next !=null){
                    last = first;
                    Node<T> current = first.next;
                    first.next = null;
                    while (current !=null){
                        Node<T> next = current.next;
                        current.next = first;
                        first = current;
                        current = next;
                    }
                }
            }
        }
    }

