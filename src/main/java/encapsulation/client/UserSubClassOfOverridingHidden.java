package encapsulation.client;

import encapsulation.implementation.PublicOverridingClass;

// These examples are just to cover cases when the exposed class actually overrides methods of implementation class.
// It is not nearly as important as the ones in InheritingUserSubclass and UserWrappingFinalInheritingClass!
public class UserSubClassOfOverridingHidden extends PublicOverridingClass {

    @Override  // This does overrides PublicOverridingClass.privateHiddenMethod() but only because we declared
               // a public method named as such there. We cannot actually access HiddenClass.privateHiddenMethod() this way.
    public void privateHiddenMethod() {}

    @Override
//    private void packagePrivateHiddenMethod() { // We cannot decrease the scope of an overridden method but remember:
                                                  // This is a public method of PublicOverridingClass and
                                                  // HiddenClass.packagePrivateHiddenMethod() is not actually accessible from here!
    public void packagePrivateHiddenMethod() {
        super.packagePrivateHiddenMethod(); // We don't have direct access to HiddenClass.packagePrivateHiddenMethod() here.
                                            // PublicOverridingClass may or may not call it's parent's method.
                                            // And if it does, it can (and probably does) something else on top of that.
    }

    @Override
//    void protectedHiddenMethod() { // We cannot decrease the scope of an overridden method but remember:
                                     // This is a public method of PublicOverridingClass and
                                     // HiddenClass.protectedHiddenMethod() is not actually accessible from here!
    public void protectedHiddenMethod() {
        super.protectedHiddenMethod(); // We don't have direct access to HiddenClass.protectedHiddenMethod() here.
                                       // PublicOverridingClass may or may not call it's parent's method.
                                       // And if it does, it can (and probably does) something else on top of that.
    }

    @Override
    public void publicHiddenMethod() {
//        super.super.publicHiddenMethod(); // This is nonsense
    }

}
