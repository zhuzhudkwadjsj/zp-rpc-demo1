package zp.rpc.easy.model;/**
 * 功能描述
 *
 * @author MyFellingIsBetter
 * @date 2024/09/18  21:19
 */

/**
 *@ClassName RpcResponse
 *@Description TODO
 *@Author MyFellingIsBetter
 *@Date 2024/9/18 21:19
 *@Version 1.0
 */

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * RPC 响应
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RpcResponse implements Serializable {

    /**
     * 响应数据
     */
    private Object data;

    /**
     * 响应数据类型（预留）
     */
    private Class<?> dataType;

    /**
     * 响应信息
     */
    private String message;

    /**
     * 异常信息
     */
    private Exception exception;

}

