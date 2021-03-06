package UserMethods;

import java.lang.module.ModuleDescriptor;
import java.util.stream.Collectors;

public class VersionTest {
    public static void main(String[] args) {
        Runtime.Version jreVersion = Runtime.version();
        System.out.printf("Current JRE Version: " + jreVersion);
        printVersionDetails(jreVersion.toString());

        String[] versionStrings = {
                "10", "10.1", "10.0.1.2", "10.0.2.3.4", "10.0.0",
                "10.1.2-ea+153", "10+132", "10-ea+24-2018-01-23", "10+123",
                "10.0.1-ea+132-2018-01-28.10.56.45am"
        };
        for(String vstr: versionStrings) {
            printVersionDetails(vstr);
        }

    }


    public static void printVersionDetails(String vstr) {
        try {
            Runtime.Version version = Runtime.Version.parse(vstr);
            String vnumAdditionalInfo = version.version()
                                        .stream()
                                        .skip(4)
                                        .map(Object::toString)
                                        .collect(Collectors.joining("."));

            System.out.printf("Version String= %s%n", vstr);
            System.out.printf("feature=%d, interim=%d, update=%d, patch=%d,"
                                    + " additional info=%s,"
                                    + " pre=%s, build=%s, optional=%s %n%n",
                                    version.feature(),
                                    version.interim(),
                                    version.update(),
                                    version.patch(),
                                    vnumAdditionalInfo,
                                    version.pre().orElse(""),
                                    version.build().isPresent() ? version.build().get().toString(): "",
                                        version.optional().orElse(""));
        } catch (Exception e) {
            System.out.printf("%s%n%n", e.getMessage());
        }





        }
    }


