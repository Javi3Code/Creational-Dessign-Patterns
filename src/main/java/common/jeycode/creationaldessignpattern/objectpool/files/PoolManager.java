package common.jeycode.creationaldessignpattern.objectpool.files;

public interface PoolManager<T>
{

      T getReusableObject() throws Exception;

      void setInitialNumberOfObjects(int quantity);

      void idealNumberOfObjects(int quantity);

      void setMaxNumberOfObjects(int max);

      void setTimeOut(float seconds);
}
