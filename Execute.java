import java.util.ArrayList;
import java.util.List;

public class Execute{
        public static void main(String[] args){
                Runnable newTask = new Runnable(){
                        @Override
                        public void run(){
                                System.out.println("Running the taks");
                        }
                };
                List<Runnable> list = new ArrayList<>();
                list.add(newTask);
                MultiExecutor multiExecutor = new MultiExecutor(list);
                multiExecutor.executeAll();
        
        }

}