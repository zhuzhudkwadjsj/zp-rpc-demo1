package zp.rpc.easy.proxy;/**
 * 功能描述
 *
 * @author MyFellingIsBetter
 * @date 2024/09/18  22:54
 */

import java.lang.reflect.Proxy;

/**
 *@ClassName ServiceProxyFactory
 *@Description TODO
 *@Author MyFellingIsBetter
 *@Date 2024/9/18 22:54
 *@Version 1.0
 */
public class ServiceProxyFactory {

    /**
     * 根据服务类获取代理对象
     *
     * @param serviceClass
     * @param <T>
     * @return
     */
    public static <T> T getProxy(Class<T> serviceClass) {
        return (T) Proxy.newProxyInstance(
                serviceClass.getClassLoader(),
                new Class[]{serviceClass},
                new ServiceProxy());
    }
}
