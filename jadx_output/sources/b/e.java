package b;

import android.os.Bundle;
import com.ai.assistance.operit.provider.MainComposeActivity;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public final /* synthetic */ class e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MainComposeActivity f3584a;

    public /* synthetic */ e(MainComposeActivity mainComposeActivity) {
        this.f3584a = mainComposeActivity;
    }

    public final void a() {
        MainComposeActivity mainComposeActivity = this.f3584a;
        Bundle a3 = ((A1.e) mainComposeActivity.h.f217c).a("android:support:activity-result");
        if (a3 != null) {
            f fVar = mainComposeActivity.f3606m;
            fVar.getClass();
            ArrayList<Integer> integerArrayList = a3.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = a3.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList == null || integerArrayList == null) {
                return;
            }
            fVar.f3587c = a3.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
            Bundle bundle = a3.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
            Bundle bundle2 = fVar.f3590f;
            bundle2.putAll(bundle);
            for (int i3 = 0; i3 < stringArrayList.size(); i3++) {
                String str = stringArrayList.get(i3);
                HashMap hashMap = fVar.f3586b;
                boolean containsKey = hashMap.containsKey(str);
                HashMap hashMap2 = fVar.f3585a;
                if (containsKey) {
                    Integer num = (Integer) hashMap.remove(str);
                    if (!bundle2.containsKey(str)) {
                        hashMap2.remove(num);
                    }
                }
                Integer num2 = integerArrayList.get(i3);
                num2.intValue();
                String str2 = stringArrayList.get(i3);
                hashMap2.put(num2, str2);
                hashMap.put(str2, num2);
            }
        }
    }
}
