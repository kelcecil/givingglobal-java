# Global Giving API library for Java
### WIP library for easy Global Giving API work in Java

No guarantees are made to the stability of this library yet.

## Supported Operations

* GetOrganization
* GetThemes
* GetThemesWithProjects

## Usage

Export your Global Giving API key as an environment variable called GLOBALGIVING_APIKEY.

Try something like this...

```java
package org.kelcecil.globalgiving;

import org.kelcecil.globalgiving.model.Organization;
import org.kelcecil.globalgiving.model.Theme;

import java.util.List;

public class GlobalGivingMain {
    public static void main(String[] args) {
        // Create a new client
        GlobalGivingClient client = new GlobalGivingClient();

        // Try getting themes!!!
        List<Theme> themes = client.getThemes();
        System.out.println(themes.get(0).getName());
        System.out.println(themes.get(1).getName());

        // Try getting organizations!!!
        Organization organization = client.getOrganization(1);
        System.out.println(organization.getName());
        System.out.println(organization.getThemes().size());
    }
}
```


## License

MIT. See LICENSE.
