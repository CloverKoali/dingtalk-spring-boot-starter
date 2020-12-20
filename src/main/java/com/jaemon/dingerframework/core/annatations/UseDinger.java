/*
 * Copyright ©2015-2020 Jaemon. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.jaemon.dingerframework.core.annatations;

import com.jaemon.dingerframework.core.entity.enums.DingerType;

import java.lang.annotation.*;

/**
 * UseDinger
 *
 * @author Jaemon
 * @since 4.0
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
public @interface UseDinger {
    /**
     * 指定使用的Dinger
     *
     * @return
     *         返回Dinger {@link DingerType}
     */
    DingerType value() default DingerType.DINGTALK;
}
