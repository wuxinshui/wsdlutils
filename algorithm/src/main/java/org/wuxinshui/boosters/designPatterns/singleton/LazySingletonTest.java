package org.wuxinshui.boosters.designPatterns.singleton;

/**
 * Copyright [2017$] [Wuxinshui]
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * Created by wuxinshui on 2017/2/7.
 */
public class LazySingletonTest {
	public static void main(String[] args) {
		new Thread(){
			public void run(){
				long bg = System.currentTimeMillis();
				for (int i = 0; i < 100000; i++) {
			Singleton1.getInstance();
//					LazySingleton.getInstance();
				}
				System.out.println("spend:" + (System.currentTimeMillis() - bg));
			}
		}.start();
	}
}