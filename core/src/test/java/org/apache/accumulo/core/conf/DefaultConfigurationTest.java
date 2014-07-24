/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.accumulo.core.conf;

import java.util.Iterator;
import java.util.Map;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DefaultConfigurationTest {
  private DefaultConfiguration c;

  @Before
  public void setUp() {
    c = new DefaultConfiguration();
  }

  @Test
  public void testGet() {
    assertEquals(Property.MASTER_CLIENTPORT.getDefaultValue(), c.get(Property.MASTER_CLIENTPORT));
  }

  @Test
  public void testGetProperties() {
    Iterator<Map.Entry<String,String>> iter = c.iterator();
    while (iter.hasNext()) {
      Map.Entry<String,String> e = iter.next();
      Property p = Property.getPropertyByKey(e.getKey());
      assertEquals(p.getDefaultValue(), e.getValue());
    }
  }
}
