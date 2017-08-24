/**
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
package tools.descartes.petsupplystore.rest.test;

/**
 * Entity for testing REST.
 * @author Joakim von Kistowski
 *
 */
public class TestEntity {

	private long id;
	private String attribute;
	
	/**
	 * Gets the id.
	 * @return the id.
	 */
	public long getId() {
		return id;
	}
	/**
	 * Sets the id.
	 * @param id The id.
	 */
	public void setId(long id) {
		this.id = id;
	}
	/**
	 * Gets the Attribute.
	 * @return the attribute.
	 */
	public String getAttribute() {
		return attribute;
	}
	/**
	 * Sets the attribute.
	 * @param attribute The attribute.
	 */
	public void setAttribute(String attribute) {
		this.attribute = attribute;
	}
	
}