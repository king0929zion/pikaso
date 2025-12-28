package O1;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
import com.ai.assistance.operit.provider.R;
import com.google.android.material.carousel.CarouselLayoutManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import z1.u;

/* loaded from: classes.dex */
public final class a extends u {

    /* renamed from: a, reason: collision with root package name */
    public final Paint f2060a;

    /* renamed from: b, reason: collision with root package name */
    public final List f2061b;

    public a() {
        Paint paint = new Paint();
        this.f2060a = paint;
        this.f2061b = Collections.unmodifiableList(new ArrayList());
        paint.setStrokeWidth(5.0f);
        paint.setColor(-65281);
    }

    @Override // z1.u
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        int i3;
        int i4;
        int u3;
        int v3;
        Paint paint = this.f2060a;
        paint.setStrokeWidth(recyclerView.getResources().getDimension(R.dimen.m3_carousel_debug_keyline_width));
        Iterator it = this.f2061b.iterator();
        while (it.hasNext()) {
            ((c) it.next()).getClass();
            int i5 = V0.a.f2458a;
            float f3 = 1.0f - 0.0f;
            paint.setColor(Color.argb((int) ((Color.alpha(-16776961) * 0.0f) + (Color.alpha(-65281) * f3)), (int) ((Color.red(-16776961) * 0.0f) + (Color.red(-65281) * f3)), (int) ((Color.green(-16776961) * 0.0f) + (Color.green(-65281) * f3)), (int) ((Color.blue(-16776961) * 0.0f) + (Color.blue(-65281) * f3))));
            if (((CarouselLayoutManager) recyclerView.getLayoutManager()).O()) {
                b bVar = ((CarouselLayoutManager) recyclerView.getLayoutManager()).h;
                switch (bVar.f2063b) {
                    case 0:
                        i3 = 0;
                        break;
                    default:
                        i3 = bVar.f2064c.w();
                        break;
                }
                float f4 = i3;
                b bVar2 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).h;
                switch (bVar2.f2063b) {
                    case 0:
                        i4 = bVar2.f2064c.f7087g;
                        break;
                    default:
                        CarouselLayoutManager carouselLayoutManager = bVar2.f2064c;
                        i4 = carouselLayoutManager.f7087g - carouselLayoutManager.t();
                        break;
                }
                canvas.drawLine(0.0f, f4, 0.0f, i4, paint);
            } else {
                b bVar3 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).h;
                switch (bVar3.f2063b) {
                    case 0:
                        u3 = bVar3.f2064c.u();
                        break;
                    default:
                        u3 = 0;
                        break;
                }
                float f5 = u3;
                b bVar4 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).h;
                switch (bVar4.f2063b) {
                    case 0:
                        CarouselLayoutManager carouselLayoutManager2 = bVar4.f2064c;
                        v3 = carouselLayoutManager2.f7086f - carouselLayoutManager2.v();
                        break;
                    default:
                        v3 = bVar4.f2064c.f7086f;
                        break;
                }
                canvas.drawLine(f5, 0.0f, v3, 0.0f, paint);
            }
        }
    }
}
