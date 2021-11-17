package encapsulation;

import encapsulation.client.InheritingUserSubclass;
import encapsulation.client.UserOfComposedPublicClass;
import encapsulation.client.UserWrappingFinalInheritingClass;
import encapsulation.client.UserSubClassOfOverridingHidden;

/**
 * We believe our IDE to tell us what won't work. But let's test in runtime the stuff our IDE does not complain about, just in case.
 */
public class Main {

    public static void main( String[] args ) {
        InheritingUserSubclass subClass = new InheritingUserSubclass();
        subClass.privateHiddenMethod();
        subClass.packagePrivateHiddenMethod();
        subClass.exposedPackagePrivateHiddenMethod();
        subClass.protectedHiddenMethod();
        subClass.publicHiddenMethod();

        UserSubClassOfOverridingHidden userSubClassOfOverridingHidden = new UserSubClassOfOverridingHidden();
        userSubClassOfOverridingHidden.privateHiddenMethod();
        userSubClassOfOverridingHidden.packagePrivateHiddenMethod();
        userSubClassOfOverridingHidden.protectedHiddenMethod();
        userSubClassOfOverridingHidden.publicHiddenMethod();

        UserWrappingFinalInheritingClass userWrappingFinalInheritingClass = new UserWrappingFinalInheritingClass();
        userWrappingFinalInheritingClass.privateHiddenMethod();
        userWrappingFinalInheritingClass.packagePrivateHiddenMethod();
        userWrappingFinalInheritingClass.protectedHiddenMethod();
        userWrappingFinalInheritingClass.publicHiddenMethod();

        UserOfComposedPublicClass userOfComposedPublicClass = new UserOfComposedPublicClass();
        userOfComposedPublicClass.privateHiddenMethod();
        userOfComposedPublicClass.packagePrivateHiddenMethod();
        userOfComposedPublicClass.protectedHiddenMethod();
        userOfComposedPublicClass.publicHiddenMethod();
    }

}
