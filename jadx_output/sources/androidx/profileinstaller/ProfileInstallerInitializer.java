package androidx.profileinstaller;

import B1.b;
import android.content.Context;
import java.util.Collections;
import java.util.List;
import s1.C0589c;
import x1.AbstractC0657i;

/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements b {
    @Override // B1.b
    public final List a() {
        return Collections.emptyList();
    }

    @Override // B1.b
    public final Object b(Context context) {
        AbstractC0657i.a(new R.b(this, 2, context.getApplicationContext()));
        return new C0589c(9, false);
    }
}
