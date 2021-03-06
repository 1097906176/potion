/*
 * Copyright 2002-2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package cn.love.potion.test;

import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author cicicc
 * @since 0.0.1
 */
public class ArrayTest {

    public static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");

    public static String formatDate(Date date) {
        return dateFormat.format(date);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            list.add(random.nextInt(100));
        }
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer i = iterator.next();
            if (i % 2 == 0) {
                //说明为偶数,进行删除
                iterator.remove();
            }
        }
        for (int j : list) {
            System.out.println(j);
        }

    }

    @Test
    public void errorRemove(){
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 1000; i++) {
            list.add(random.nextInt(10000));
        }
        for (Integer i : list) {
            if (i % 2 == 0) {
                list.remove(i);
            }
        }
    }
}
