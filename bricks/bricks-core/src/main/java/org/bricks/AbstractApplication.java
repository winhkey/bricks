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

package org.bricks;

import org.bricks.listener.Log4j2ApplicationListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationListener;

/**
 * 抽象启动类
 *
 * @author fuzy
 *
 */
@SpringBootApplication
public abstract class AbstractApplication
{

    /**
     * 添加监听器
     *
     * @param application 应用
     * @param listeners 监听器列表
     * @return 应用
     */
    protected static SpringApplication addListeners(SpringApplication application,
            final ApplicationListener<?>... listeners)
    {
        application.addListeners(listeners);
        application.addListeners(new Log4j2ApplicationListener());
        return application;
    }

}
