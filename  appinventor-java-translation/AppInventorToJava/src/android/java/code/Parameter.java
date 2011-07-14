/*
   appinventor-java-translation

   Originally authored by Joshua Swank at the University of Alabama
   Work supported in part by NSF award #0702764 and a Google 2011 CS4HS award

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
*/

package android.java.code;

/**
 *
 * @author Joshua
 */
public class Parameter
{
    private String type, identifier;
    private int index;

    public Parameter( String type, String identifier, int index )
    {
        this.type = type;
        this.identifier = identifier;
        this.index = index;
    }

    public int getIndex()
    {
        return index;
    }

    protected String getType()
    {
        return type;
    }

    protected String getIdentifier()
    {
        return identifier;
    }
}
