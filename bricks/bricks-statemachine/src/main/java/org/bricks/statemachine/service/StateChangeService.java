/*
 * Copyright 2020 fuzy(winhkey) (https://github.com/winhkey/bricks-root)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.bricks.statemachine.service;

import java.util.Map;

/**
 * 改变状态接口
 *
 * @author fuzy
 *
 * @param <S> 状态
 * @param <E> 事件
 */
public interface StateChangeService<S, E>
{

    /**
     * 发送事件消息
     *
     * @param event 事件
     * @param header 消息头
     * @param condition 定位条件
     * @return 结果
     */
    boolean sendEvent(E event, String header, Map<String, Object> condition);

}
