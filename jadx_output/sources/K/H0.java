package k;

import android.R;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class H0 {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f4657a;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f4658b;

    /* renamed from: c, reason: collision with root package name */
    public final ImageView f4659c;

    /* renamed from: d, reason: collision with root package name */
    public final ImageView f4660d;

    /* renamed from: e, reason: collision with root package name */
    public final ImageView f4661e;

    public H0(View view) {
        this.f4657a = (TextView) view.findViewById(R.id.text1);
        this.f4658b = (TextView) view.findViewById(R.id.text2);
        this.f4659c = (ImageView) view.findViewById(R.id.icon1);
        this.f4660d = (ImageView) view.findViewById(R.id.icon2);
        this.f4661e = (ImageView) view.findViewById(com.ai.assistance.operit.provider.R.id.edit_query);
    }
}
