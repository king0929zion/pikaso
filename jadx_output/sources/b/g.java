package b;

import android.view.View;
import android.view.Window;
import androidx.lifecycle.G;
import androidx.lifecycle.I;
import com.ai.assistance.operit.provider.MainComposeActivity;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class g implements androidx.lifecycle.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3591d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ MainComposeActivity f3592e;

    public /* synthetic */ g(MainComposeActivity mainComposeActivity, int i3) {
        this.f3591d = i3;
        this.f3592e = mainComposeActivity;
    }

    @Override // androidx.lifecycle.p
    public final void b(androidx.lifecycle.r rVar, androidx.lifecycle.l lVar) {
        switch (this.f3591d) {
            case 0:
                if (lVar == androidx.lifecycle.l.ON_STOP) {
                    Window window = this.f3592e.getWindow();
                    View peekDecorView = window != null ? window.peekDecorView() : null;
                    if (peekDecorView != null) {
                        peekDecorView.cancelPendingInputEvents();
                        break;
                    }
                }
                break;
            case 1:
                if (lVar == androidx.lifecycle.l.ON_DESTROY) {
                    this.f3592e.f3599e.f4137b = null;
                    if (!this.f3592e.isChangingConfigurations()) {
                        LinkedHashMap linkedHashMap = this.f3592e.e().f3457a;
                        Iterator it = linkedHashMap.values().iterator();
                        while (it.hasNext()) {
                            ((G) it.next()).a();
                        }
                        linkedHashMap.clear();
                    }
                    j jVar = this.f3592e.f3604k;
                    MainComposeActivity mainComposeActivity = jVar.f3597g;
                    mainComposeActivity.getWindow().getDecorView().removeCallbacks(jVar);
                    mainComposeActivity.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(jVar);
                    break;
                }
                break;
            default:
                MainComposeActivity mainComposeActivity2 = this.f3592e;
                if (mainComposeActivity2.f3602i == null) {
                    i iVar = (i) mainComposeActivity2.getLastNonConfigurationInstance();
                    if (iVar != null) {
                        mainComposeActivity2.f3602i = iVar.f3593a;
                    }
                    if (mainComposeActivity2.f3602i == null) {
                        mainComposeActivity2.f3602i = new I(0);
                    }
                }
                mainComposeActivity2.f3601g.f(this);
                break;
        }
    }
}
