/*
 * Copyright (c) 2015 MeteoGroup Deutschland GmbH
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.meteogroup.jbrotli.jni;

import org.testng.annotations.Test;

import java.net.URL;

public class LoadLibraryTest {

  @Test
  public void the_library_can_be_loaded() throws Exception {
    URL resource = this.getClass().getResource("/lib/linux-x86-amd64/libbrotli.so");
    Runtime.getRuntime().load(resource.getFile());
  }
}
