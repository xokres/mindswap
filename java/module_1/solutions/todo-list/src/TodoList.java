import java.util.PriorityQueue;

public class TodoList {

    private final PriorityQueue<TodoItem> QUEUE = new PriorityQueue<>();

    public void add(Importance importance, int priority, String item) {
        QUEUE.offer(new TodoItem(importance, priority, item));
    }

    public TodoItem remove() {
        return QUEUE.poll();
    }

    public int size() {
        return QUEUE.size();
    }

    public boolean isEmpty() {
        return QUEUE.isEmpty();
    }

    public static class TodoItem implements Comparable<TodoItem> {

        private final Importance IMPORTANCE;
        private final Integer PRIORITY;
        private final String DESCRIPTION;

        public TodoItem(Importance importance, int priority, String description) {
            this.IMPORTANCE = importance;
            this.PRIORITY = priority;
            this.DESCRIPTION = description;
        }

        @Override
        public int compareTo(TodoItem todoItem) {

            int result = IMPORTANCE.compareTo(todoItem.IMPORTANCE);

            if (result == 0) {
                result =  PRIORITY.compareTo(todoItem.PRIORITY);//  Integer.compare(PRIORITY, todoItem.PRIORITY);
            }

            if (result == 0) {
                result = DESCRIPTION.compareTo(todoItem.DESCRIPTION);
            }

            return result;
        }

        @Override
        public String toString() {
            return "TodoItem:\n" +
                    "importance= " + IMPORTANCE + "\n" +
                    "priority= " + PRIORITY + "\n" +
                    "description= " + DESCRIPTION + "\n";
        }
    }

}
