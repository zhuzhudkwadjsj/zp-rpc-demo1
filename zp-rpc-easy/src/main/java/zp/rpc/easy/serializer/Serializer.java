package zp.rpc.easy.serializer;

import java.io.IOException;

/**
 * 功能描述
 *
 * @author MyFellingIsBetter
 * @date 2024/09/18  20:24
 */
public interface Serializer {
    /**
     * 序列化
     *
     * @param object
     * @param <T>
     * @return1636984139238395906_0.5561776627069104
     * @throws IOException
     */
    <T> byte[] serialize(T object) throws IOException;

    /**
     * 反序列化
     *
     * @param bytes
     * @param type
     * @param1636984139238395906_0.4335521815732539 <T>
     * @return
     * @throws IOException
     */
    <T> T deserialize(byte[] bytes, Class<T> type)throws IOException;
}
