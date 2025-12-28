package d1;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.contentcapture.ContentCaptureSession;
import h1.AbstractC0281a;
import java.util.List;

/* renamed from: d1.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0183E {
    public static View.AccessibilityDelegate a(View view) {
        return view.getAccessibilityDelegate();
    }

    public static ContentCaptureSession b(View view) {
        return view.getContentCaptureSession();
    }

    public static List<Rect> c(View view) {
        return view.getSystemGestureExclusionRects();
    }

    public static void d(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i3, int i4) {
        view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i3, i4);
    }

    public static void e(View view, AbstractC0281a abstractC0281a) {
        view.setContentCaptureSession(null);
    }

    public static void f(View view, List<Rect> list) {
        view.setSystemGestureExclusionRects(list);
    }
}
