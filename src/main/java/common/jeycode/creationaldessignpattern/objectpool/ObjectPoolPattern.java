package common.jeycode.creationaldessignpattern.objectpool;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import common.jeycode.creationaldessignpattern.objectpool.files.HeavyObjectsPoolManager;

public class ObjectPoolPattern
{

      HeavyObjectsPoolManager manager;
      List<Thread> threads = new ArrayList<>();

      public ObjectPoolPattern() throws Exception
      {
            manager = HeavyObjectsPoolManager.getPoolManager();
            manager.setInitialNumberOfObjects(5);
            manager.setMaxNumberOfObjects(10);
            manager.idealNumberOfObjects(6);
            manager.setTimeOut(1f);
            loadThreadList();
      }

      private void createObjectAndUse()
      {
            try (var objt = manager.getReusableObject())
            {
                  objt.doHeavyOperations();
            }
            catch (Exception ex)
            {
                  System.out.println(ex.getMessage());
            }
      }

      private void loadThreadList()
      {
            IntStream.range(0,10000)
                     .forEach(e-> threads.add(new Thread(this::createObjectAndUse)));
            threads.forEach(Thread::start);

      }

      public static void main(String[] args)
      {
            try
            {
                  new ObjectPoolPattern();
            }
            catch (Exception ex)
            {
                  ex.printStackTrace();
            }
      }

}
