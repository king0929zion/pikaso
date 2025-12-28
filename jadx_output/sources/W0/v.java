package w0;

import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.DrawFilter;
import android.graphics.Matrix;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Picture;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.RenderNode;
import android.graphics.fonts.Font;
import android.graphics.text.MeasuredText;

/* loaded from: classes.dex */
public final class v extends Canvas {

    /* renamed from: a, reason: collision with root package name */
    public Canvas f6537a;

    @Override // android.graphics.Canvas
    public final boolean clipOutPath(Path path) {
        C0633d c0633d = C0633d.f6496a;
        Canvas canvas = this.f6537a;
        if (canvas != null) {
            return c0633d.a(canvas, path);
        }
        p2.g.h("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(RectF rectF) {
        C0633d c0633d = C0633d.f6496a;
        Canvas canvas = this.f6537a;
        if (canvas != null) {
            return c0633d.e(canvas, rectF);
        }
        p2.g.h("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipPath(Path path, Region.Op op) {
        Canvas canvas = this.f6537a;
        if (canvas != null) {
            return canvas.clipPath(path, op);
        }
        p2.g.h("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(RectF rectF, Region.Op op) {
        Canvas canvas = this.f6537a;
        if (canvas != null) {
            return canvas.clipRect(rectF, op);
        }
        p2.g.h("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void concat(Matrix matrix) {
        Canvas canvas = this.f6537a;
        if (canvas != null) {
            canvas.concat(matrix);
        } else {
            p2.g.h("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void disableZ() {
        C0634e c0634e = C0634e.f6497a;
        Canvas canvas = this.f6537a;
        if (canvas != null) {
            c0634e.a(canvas);
        } else {
            p2.g.h("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawARGB(int i3, int i4, int i5, int i6) {
        Canvas canvas = this.f6537a;
        if (canvas != null) {
            canvas.drawARGB(i3, i4, i5, i6);
        } else {
            p2.g.h("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawArc(RectF rectF, float f3, float f4, boolean z3, Paint paint) {
        Canvas canvas = this.f6537a;
        if (canvas != null) {
            canvas.drawArc(rectF, f3, f4, z3, paint);
        } else {
            p2.g.h("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, float f3, float f4, Paint paint) {
        Canvas canvas = this.f6537a;
        if (canvas != null) {
            canvas.drawBitmap(bitmap, f3, f4, paint);
        } else {
            p2.g.h("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawBitmapMesh(Bitmap bitmap, int i3, int i4, float[] fArr, int i5, int[] iArr, int i6, Paint paint) {
        Canvas canvas = this.f6537a;
        if (canvas != null) {
            canvas.drawBitmapMesh(bitmap, i3, i4, fArr, i5, iArr, i6, paint);
        } else {
            p2.g.h("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawCircle(float f3, float f4, float f5, Paint paint) {
        Canvas canvas = this.f6537a;
        if (canvas != null) {
            canvas.drawCircle(f3, f4, f5, paint);
        } else {
            p2.g.h("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i3) {
        Canvas canvas = this.f6537a;
        if (canvas != null) {
            canvas.drawColor(i3);
        } else {
            p2.g.h("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawDoubleRoundRect(RectF rectF, float f3, float f4, RectF rectF2, float f5, float f6, Paint paint) {
        C0634e c0634e = C0634e.f6497a;
        Canvas canvas = this.f6537a;
        if (canvas != null) {
            c0634e.e(canvas, rectF, f3, f4, rectF2, f5, f6, paint);
        } else {
            p2.g.h("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawGlyphs(int[] iArr, int i3, float[] fArr, int i4, int i5, Font font, Paint paint) {
        h hVar = h.f6499a;
        Canvas canvas = this.f6537a;
        if (canvas != null) {
            hVar.a(canvas, iArr, i3, fArr, i4, i5, font, paint);
        } else {
            p2.g.h("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawLine(float f3, float f4, float f5, float f6, Paint paint) {
        Canvas canvas = this.f6537a;
        if (canvas != null) {
            canvas.drawLine(f3, f4, f5, f6, paint);
        } else {
            p2.g.h("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawLines(float[] fArr, int i3, int i4, Paint paint) {
        Canvas canvas = this.f6537a;
        if (canvas != null) {
            canvas.drawLines(fArr, i3, i4, paint);
        } else {
            p2.g.h("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawOval(RectF rectF, Paint paint) {
        Canvas canvas = this.f6537a;
        if (canvas != null) {
            canvas.drawOval(rectF, paint);
        } else {
            p2.g.h("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPaint(Paint paint) {
        Canvas canvas = this.f6537a;
        if (canvas != null) {
            canvas.drawPaint(paint);
        } else {
            p2.g.h("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPatch(NinePatch ninePatch, Rect rect, Paint paint) {
        h hVar = h.f6499a;
        Canvas canvas = this.f6537a;
        if (canvas != null) {
            hVar.b(canvas, ninePatch, rect, paint);
        } else {
            p2.g.h("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPath(Path path, Paint paint) {
        Canvas canvas = this.f6537a;
        if (canvas != null) {
            canvas.drawPath(path, paint);
        } else {
            p2.g.h("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(Picture picture) {
        Canvas canvas = this.f6537a;
        if (canvas != null) {
            canvas.drawPicture(picture);
        } else {
            p2.g.h("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPoint(float f3, float f4, Paint paint) {
        Canvas canvas = this.f6537a;
        if (canvas != null) {
            canvas.drawPoint(f3, f4, paint);
        } else {
            p2.g.h("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPoints(float[] fArr, int i3, int i4, Paint paint) {
        Canvas canvas = this.f6537a;
        if (canvas != null) {
            canvas.drawPoints(fArr, i3, i4, paint);
        } else {
            p2.g.h("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPosText(char[] cArr, int i3, int i4, float[] fArr, Paint paint) {
        Canvas canvas = this.f6537a;
        if (canvas != null) {
            canvas.drawPosText(cArr, i3, i4, fArr, paint);
        } else {
            p2.g.h("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRGB(int i3, int i4, int i5) {
        Canvas canvas = this.f6537a;
        if (canvas != null) {
            canvas.drawRGB(i3, i4, i5);
        } else {
            p2.g.h("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRect(RectF rectF, Paint paint) {
        Canvas canvas = this.f6537a;
        if (canvas != null) {
            canvas.drawRect(rectF, paint);
        } else {
            p2.g.h("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRenderNode(RenderNode renderNode) {
        C0634e c0634e = C0634e.f6497a;
        Canvas canvas = this.f6537a;
        if (canvas != null) {
            c0634e.g(canvas, renderNode);
        } else {
            p2.g.h("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRoundRect(RectF rectF, float f3, float f4, Paint paint) {
        Canvas canvas = this.f6537a;
        if (canvas != null) {
            canvas.drawRoundRect(rectF, f3, f4, paint);
        } else {
            p2.g.h("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawText(char[] cArr, int i3, int i4, float f3, float f4, Paint paint) {
        Canvas canvas = this.f6537a;
        if (canvas != null) {
            canvas.drawText(cArr, i3, i4, f3, f4, paint);
        } else {
            p2.g.h("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawTextOnPath(char[] cArr, int i3, int i4, Path path, float f3, float f4, Paint paint) {
        Canvas canvas = this.f6537a;
        if (canvas != null) {
            canvas.drawTextOnPath(cArr, i3, i4, path, f3, f4, paint);
        } else {
            p2.g.h("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(char[] cArr, int i3, int i4, int i5, int i6, float f3, float f4, boolean z3, Paint paint) {
        C0632c c0632c = C0632c.f6495a;
        Canvas canvas = this.f6537a;
        if (canvas != null) {
            c0632c.b(canvas, cArr, i3, i4, i5, i6, f3, f4, z3, paint);
        } else {
            p2.g.h("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawVertices(Canvas.VertexMode vertexMode, int i3, float[] fArr, int i4, float[] fArr2, int i5, int[] iArr, int i6, short[] sArr, int i7, int i8, Paint paint) {
        Canvas canvas = this.f6537a;
        if (canvas != null) {
            canvas.drawVertices(vertexMode, i3, fArr, i4, fArr2, i5, iArr, i6, sArr, i7, i8, paint);
        } else {
            p2.g.h("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void enableZ() {
        C0634e c0634e = C0634e.f6497a;
        Canvas canvas = this.f6537a;
        if (canvas != null) {
            c0634e.i(canvas);
        } else {
            p2.g.h("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean getClipBounds(Rect rect) {
        Canvas canvas = this.f6537a;
        if (canvas == null) {
            p2.g.h("nativeCanvas");
            throw null;
        }
        boolean clipBounds = canvas.getClipBounds(rect);
        if (clipBounds) {
            rect.set(0, 0, rect.width(), Integer.MAX_VALUE);
        }
        return clipBounds;
    }

    @Override // android.graphics.Canvas
    public final int getDensity() {
        Canvas canvas = this.f6537a;
        if (canvas != null) {
            return canvas.getDensity();
        }
        p2.g.h("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final DrawFilter getDrawFilter() {
        Canvas canvas = this.f6537a;
        if (canvas != null) {
            return canvas.getDrawFilter();
        }
        p2.g.h("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int getHeight() {
        Canvas canvas = this.f6537a;
        if (canvas != null) {
            return canvas.getHeight();
        }
        p2.g.h("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void getMatrix(Matrix matrix) {
        Canvas canvas = this.f6537a;
        if (canvas != null) {
            canvas.getMatrix(matrix);
        } else {
            p2.g.h("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final int getMaximumBitmapHeight() {
        Canvas canvas = this.f6537a;
        if (canvas != null) {
            return canvas.getMaximumBitmapHeight();
        }
        p2.g.h("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int getMaximumBitmapWidth() {
        Canvas canvas = this.f6537a;
        if (canvas != null) {
            return canvas.getMaximumBitmapWidth();
        }
        p2.g.h("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int getSaveCount() {
        Canvas canvas = this.f6537a;
        if (canvas != null) {
            return canvas.getSaveCount();
        }
        p2.g.h("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int getWidth() {
        Canvas canvas = this.f6537a;
        if (canvas != null) {
            return canvas.getWidth();
        }
        p2.g.h("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean isOpaque() {
        Canvas canvas = this.f6537a;
        if (canvas != null) {
            return canvas.isOpaque();
        }
        p2.g.h("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(RectF rectF, Canvas.EdgeType edgeType) {
        Canvas canvas = this.f6537a;
        if (canvas != null) {
            return canvas.quickReject(rectF, edgeType);
        }
        p2.g.h("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void restore() {
        Canvas canvas = this.f6537a;
        if (canvas != null) {
            canvas.restore();
        } else {
            p2.g.h("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void restoreToCount(int i3) {
        Canvas canvas = this.f6537a;
        if (canvas != null) {
            canvas.restoreToCount(i3);
        } else {
            p2.g.h("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void rotate(float f3) {
        Canvas canvas = this.f6537a;
        if (canvas != null) {
            canvas.rotate(f3);
        } else {
            p2.g.h("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final int save() {
        Canvas canvas = this.f6537a;
        if (canvas != null) {
            return canvas.save();
        }
        p2.g.h("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(RectF rectF, Paint paint, int i3) {
        Canvas canvas = this.f6537a;
        if (canvas != null) {
            return canvas.saveLayer(rectF, paint, i3);
        }
        p2.g.h("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(RectF rectF, int i3, int i4) {
        Canvas canvas = this.f6537a;
        if (canvas != null) {
            return canvas.saveLayerAlpha(rectF, i3, i4);
        }
        p2.g.h("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void scale(float f3, float f4) {
        Canvas canvas = this.f6537a;
        if (canvas != null) {
            canvas.scale(f3, f4);
        } else {
            p2.g.h("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void setBitmap(Bitmap bitmap) {
        Canvas canvas = this.f6537a;
        if (canvas != null) {
            canvas.setBitmap(bitmap);
        } else {
            p2.g.h("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void setDensity(int i3) {
        Canvas canvas = this.f6537a;
        if (canvas != null) {
            canvas.setDensity(i3);
        } else {
            p2.g.h("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void setDrawFilter(DrawFilter drawFilter) {
        Canvas canvas = this.f6537a;
        if (canvas != null) {
            canvas.setDrawFilter(drawFilter);
        } else {
            p2.g.h("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void setMatrix(Matrix matrix) {
        Canvas canvas = this.f6537a;
        if (canvas != null) {
            canvas.setMatrix(matrix);
        } else {
            p2.g.h("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void skew(float f3, float f4) {
        Canvas canvas = this.f6537a;
        if (canvas != null) {
            canvas.skew(f3, f4);
        } else {
            p2.g.h("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void translate(float f3, float f4) {
        Canvas canvas = this.f6537a;
        if (canvas != null) {
            canvas.translate(f3, f4);
        } else {
            p2.g.h("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(Rect rect) {
        C0633d c0633d = C0633d.f6496a;
        Canvas canvas = this.f6537a;
        if (canvas != null) {
            return c0633d.d(canvas, rect);
        }
        p2.g.h("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipPath(Path path) {
        Canvas canvas = this.f6537a;
        if (canvas != null) {
            return canvas.clipPath(path);
        }
        p2.g.h("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(Rect rect, Region.Op op) {
        Canvas canvas = this.f6537a;
        if (canvas != null) {
            return canvas.clipRect(rect, op);
        }
        p2.g.h("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void drawArc(float f3, float f4, float f5, float f6, float f7, float f8, boolean z3, Paint paint) {
        Canvas canvas = this.f6537a;
        if (canvas != null) {
            canvas.drawArc(f3, f4, f5, f6, f7, f8, z3, paint);
        } else {
            p2.g.h("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, Rect rect, RectF rectF, Paint paint) {
        Canvas canvas = this.f6537a;
        if (canvas != null) {
            canvas.drawBitmap(bitmap, rect, rectF, paint);
        } else {
            p2.g.h("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawColor(long j3) {
        C0634e c0634e = C0634e.f6497a;
        Canvas canvas = this.f6537a;
        if (canvas != null) {
            c0634e.c(canvas, j3);
        } else {
            p2.g.h("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawLines(float[] fArr, Paint paint) {
        Canvas canvas = this.f6537a;
        if (canvas != null) {
            canvas.drawLines(fArr, paint);
        } else {
            p2.g.h("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawOval(float f3, float f4, float f5, float f6, Paint paint) {
        Canvas canvas = this.f6537a;
        if (canvas != null) {
            canvas.drawOval(f3, f4, f5, f6, paint);
        } else {
            p2.g.h("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPatch(NinePatch ninePatch, RectF rectF, Paint paint) {
        h hVar = h.f6499a;
        Canvas canvas = this.f6537a;
        if (canvas != null) {
            hVar.c(canvas, ninePatch, rectF, paint);
        } else {
            p2.g.h("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(Picture picture, RectF rectF) {
        Canvas canvas = this.f6537a;
        if (canvas != null) {
            canvas.drawPicture(picture, rectF);
        } else {
            p2.g.h("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPoints(float[] fArr, Paint paint) {
        Canvas canvas = this.f6537a;
        if (canvas != null) {
            canvas.drawPoints(fArr, paint);
        } else {
            p2.g.h("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPosText(String str, float[] fArr, Paint paint) {
        Canvas canvas = this.f6537a;
        if (canvas != null) {
            canvas.drawPosText(str, fArr, paint);
        } else {
            p2.g.h("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRect(Rect rect, Paint paint) {
        Canvas canvas = this.f6537a;
        if (canvas != null) {
            canvas.drawRect(rect, paint);
        } else {
            p2.g.h("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRoundRect(float f3, float f4, float f5, float f6, float f7, float f8, Paint paint) {
        Canvas canvas = this.f6537a;
        if (canvas != null) {
            canvas.drawRoundRect(f3, f4, f5, f6, f7, f8, paint);
        } else {
            p2.g.h("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawText(String str, float f3, float f4, Paint paint) {
        Canvas canvas = this.f6537a;
        if (canvas != null) {
            canvas.drawText(str, f3, f4, paint);
        } else {
            p2.g.h("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawTextOnPath(String str, Path path, float f3, float f4, Paint paint) {
        Canvas canvas = this.f6537a;
        if (canvas != null) {
            canvas.drawTextOnPath(str, path, f3, f4, paint);
        } else {
            p2.g.h("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(RectF rectF) {
        g gVar = g.f6498a;
        Canvas canvas = this.f6537a;
        if (canvas != null) {
            return gVar.c(canvas, rectF);
        }
        p2.g.h("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(RectF rectF, Paint paint) {
        Canvas canvas = this.f6537a;
        if (canvas != null) {
            return canvas.saveLayer(rectF, paint);
        }
        p2.g.h("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(RectF rectF, int i3) {
        Canvas canvas = this.f6537a;
        if (canvas != null) {
            return canvas.saveLayerAlpha(rectF, i3);
        }
        p2.g.h("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(float f3, float f4, float f5, float f6) {
        C0633d c0633d = C0633d.f6496a;
        Canvas canvas = this.f6537a;
        if (canvas != null) {
            return c0633d.b(canvas, f3, f4, f5, f6);
        }
        p2.g.h("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(RectF rectF) {
        Canvas canvas = this.f6537a;
        if (canvas != null) {
            return canvas.clipRect(rectF);
        }
        p2.g.h("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, Rect rect, Rect rect2, Paint paint) {
        Canvas canvas = this.f6537a;
        if (canvas != null) {
            canvas.drawBitmap(bitmap, rect, rect2, paint);
        } else {
            p2.g.h("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i3, PorterDuff.Mode mode) {
        Canvas canvas = this.f6537a;
        if (canvas != null) {
            canvas.drawColor(i3, mode);
        } else {
            p2.g.h("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(Picture picture, Rect rect) {
        Canvas canvas = this.f6537a;
        if (canvas != null) {
            canvas.drawPicture(picture, rect);
        } else {
            p2.g.h("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRect(float f3, float f4, float f5, float f6, Paint paint) {
        Canvas canvas = this.f6537a;
        if (canvas != null) {
            canvas.drawRect(f3, f4, f5, f6, paint);
        } else {
            p2.g.h("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawText(String str, int i3, int i4, float f3, float f4, Paint paint) {
        Canvas canvas = this.f6537a;
        if (canvas != null) {
            canvas.drawText(str, i3, i4, f3, f4, paint);
        } else {
            p2.g.h("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(Path path, Canvas.EdgeType edgeType) {
        Canvas canvas = this.f6537a;
        if (canvas != null) {
            return canvas.quickReject(path, edgeType);
        }
        p2.g.h("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(float f3, float f4, float f5, float f6, Paint paint, int i3) {
        Canvas canvas = this.f6537a;
        if (canvas != null) {
            return canvas.saveLayer(f3, f4, f5, f6, paint, i3);
        }
        p2.g.h("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(float f3, float f4, float f5, float f6, int i3, int i4) {
        Canvas canvas = this.f6537a;
        if (canvas != null) {
            return canvas.saveLayerAlpha(f3, f4, f5, f6, i3, i4);
        }
        p2.g.h("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(int i3, int i4, int i5, int i6) {
        C0633d c0633d = C0633d.f6496a;
        Canvas canvas = this.f6537a;
        if (canvas != null) {
            return c0633d.c(canvas, i3, i4, i5, i6);
        }
        p2.g.h("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(Rect rect) {
        Canvas canvas = this.f6537a;
        if (canvas != null) {
            return canvas.clipRect(rect);
        }
        p2.g.h("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(int[] iArr, int i3, int i4, float f3, float f4, int i5, int i6, boolean z3, Paint paint) {
        Canvas canvas = this.f6537a;
        if (canvas != null) {
            canvas.drawBitmap(iArr, i3, i4, f3, f4, i5, i6, z3, paint);
        } else {
            p2.g.h("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i3, BlendMode blendMode) {
        C0634e c0634e = C0634e.f6497a;
        Canvas canvas = this.f6537a;
        if (canvas != null) {
            c0634e.b(canvas, i3, blendMode);
        } else {
            p2.g.h("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawText(CharSequence charSequence, int i3, int i4, float f3, float f4, Paint paint) {
        Canvas canvas = this.f6537a;
        if (canvas != null) {
            canvas.drawText(charSequence, i3, i4, f3, f4, paint);
        } else {
            p2.g.h("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(Path path) {
        g gVar = g.f6498a;
        Canvas canvas = this.f6537a;
        if (canvas != null) {
            return gVar.b(canvas, path);
        }
        p2.g.h("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(float f3, float f4, float f5, float f6, Paint paint) {
        Canvas canvas = this.f6537a;
        if (canvas != null) {
            return canvas.saveLayer(f3, f4, f5, f6, paint);
        }
        p2.g.h("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(float f3, float f4, float f5, float f6, int i3) {
        Canvas canvas = this.f6537a;
        if (canvas != null) {
            return canvas.saveLayerAlpha(f3, f4, f5, f6, i3);
        }
        p2.g.h("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(float f3, float f4, float f5, float f6, Region.Op op) {
        Canvas canvas = this.f6537a;
        if (canvas != null) {
            return canvas.clipRect(f3, f4, f5, f6, op);
        }
        p2.g.h("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(int[] iArr, int i3, int i4, int i5, int i6, int i7, int i8, boolean z3, Paint paint) {
        Canvas canvas = this.f6537a;
        if (canvas != null) {
            canvas.drawBitmap(iArr, i3, i4, i5, i6, i7, i8, z3, paint);
        } else {
            p2.g.h("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawColor(long j3, BlendMode blendMode) {
        C0634e c0634e = C0634e.f6497a;
        Canvas canvas = this.f6537a;
        if (canvas != null) {
            c0634e.d(canvas, j3, blendMode);
        } else {
            p2.g.h("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawDoubleRoundRect(RectF rectF, float[] fArr, RectF rectF2, float[] fArr2, Paint paint) {
        C0634e c0634e = C0634e.f6497a;
        Canvas canvas = this.f6537a;
        if (canvas != null) {
            c0634e.f(canvas, rectF, fArr, rectF2, fArr2, paint);
        } else {
            p2.g.h("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(CharSequence charSequence, int i3, int i4, int i5, int i6, float f3, float f4, boolean z3, Paint paint) {
        C0632c c0632c = C0632c.f6495a;
        Canvas canvas = this.f6537a;
        if (canvas != null) {
            c0632c.a(canvas, charSequence, i3, i4, i5, i6, f3, f4, z3, paint);
        } else {
            p2.g.h("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(float f3, float f4, float f5, float f6, Canvas.EdgeType edgeType) {
        Canvas canvas = this.f6537a;
        if (canvas != null) {
            return canvas.quickReject(f3, f4, f5, f6, edgeType);
        }
        p2.g.h("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(float f3, float f4, float f5, float f6) {
        Canvas canvas = this.f6537a;
        if (canvas != null) {
            return canvas.clipRect(f3, f4, f5, f6);
        }
        p2.g.h("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, Matrix matrix, Paint paint) {
        Canvas canvas = this.f6537a;
        if (canvas != null) {
            canvas.drawBitmap(bitmap, matrix, paint);
        } else {
            p2.g.h("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(float f3, float f4, float f5, float f6) {
        g gVar = g.f6498a;
        Canvas canvas = this.f6537a;
        if (canvas != null) {
            return gVar.a(canvas, f3, f4, f5, f6);
        }
        p2.g.h("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(int i3, int i4, int i5, int i6) {
        Canvas canvas = this.f6537a;
        if (canvas != null) {
            return canvas.clipRect(i3, i4, i5, i6);
        }
        p2.g.h("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(MeasuredText measuredText, int i3, int i4, int i5, int i6, float f3, float f4, boolean z3, Paint paint) {
        C0634e c0634e = C0634e.f6497a;
        Canvas canvas = this.f6537a;
        if (canvas != null) {
            c0634e.h(canvas, measuredText, i3, i4, i5, i6, f3, f4, z3, paint);
        } else {
            p2.g.h("nativeCanvas");
            throw null;
        }
    }
}
