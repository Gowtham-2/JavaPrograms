package com.callable;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableInterface implements Callable<Boolean> {
    private final String message;
    private final long delay;
    public CallableInterface(final String message,final long delay){
        this.message=message;
        this.delay=delay;
    }
    @Override
    public Boolean call() throws Exception {
        try{
            if(message==null){
                throw new NullPointerException("Message should not be null");
            }
            Thread.sleep(delay);
            System.out.println(message);
            return true;
        }catch (InterruptedException | NullPointerException e){
            return false;
        }
    }
}
class Main {

    public static void main(String[] args) {
        //Creating a map with msg and delay value
        Map<String,Long> input=new HashMap<>();
        input.put("Hello", 1L);
        input.put("Hii", 3L);
        input.put(null,2L);

        input.forEach((message,delay)->{
            final FutureTask<Boolean> futureTask=new FutureTask<>(new CallableInterface(message,delay));
            Thread thread=new Thread(futureTask);
            thread.start();
            try{
                final boolean result=futureTask.get();
                System.out.println(result?message+":schedlued successfully":message+":schedlue failed");
            }catch (InterruptedException | NullPointerException | ExecutionException e){
                System.out.println(e.getMessage());
            }
        });
    }
}