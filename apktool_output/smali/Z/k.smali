.class public final LZ/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZ/f;


# static fields
.field public static final A:LZ/j;


# instance fields
.field public final b:La0/a;

.field public final c:LW/p;

.field public final d:LZ/q;

.field public final e:Landroid/content/res/Resources;

.field public final f:Landroid/graphics/Rect;

.field public g:I

.field public h:I

.field public i:J

.field public j:Z

.field public k:Z

.field public l:Z

.field public final m:I

.field public n:I

.field public o:F

.field public p:Z

.field public q:F

.field public r:F

.field public s:F

.field public t:F

.field public u:F

.field public v:J

.field public w:J

.field public x:F

.field public y:F

.field public z:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LZ/j;

    invoke-direct {v0}, Landroid/graphics/Canvas;-><init>()V

    sput-object v0, LZ/k;->A:LZ/j;

    return-void
.end method

.method public constructor <init>(La0/a;)V
    .locals 3

    new-instance v0, LW/p;

    invoke-direct {v0}, LW/p;-><init>()V

    new-instance v1, LY/b;

    invoke-direct {v1}, LY/b;-><init>()V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LZ/k;->b:La0/a;

    iput-object v0, p0, LZ/k;->c:LW/p;

    new-instance v2, LZ/q;

    invoke-direct {v2, p1, v0, v1}, LZ/q;-><init>(La0/a;LW/p;LY/b;)V

    iput-object v2, p0, LZ/k;->d:LZ/q;

    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    iput-object v0, p0, LZ/k;->e:Landroid/content/res/Resources;

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, LZ/k;->f:Landroid/graphics/Rect;

    invoke-virtual {p1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    const/4 p1, 0x0

    invoke-virtual {v2, p1}, Landroid/view/View;->setClipBounds(Landroid/graphics/Rect;)V

    const-wide/16 v0, 0x0

    iput-wide v0, p0, LZ/k;->i:J

    invoke-static {}, Landroid/view/View;->generateViewId()I

    const/4 p1, 0x3

    iput p1, p0, LZ/k;->m:I

    const/4 p1, 0x0

    iput p1, p0, LZ/k;->n:I

    const/high16 p1, 0x3f800000    # 1.0f

    iput p1, p0, LZ/k;->o:F

    iput p1, p0, LZ/k;->q:F

    iput p1, p0, LZ/k;->r:F

    sget-wide v0, LW/r;->b:J

    iput-wide v0, p0, LZ/k;->v:J

    iput-wide v0, p0, LZ/k;->w:J

    return-void
.end method


# virtual methods
.method public final A(J)V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_0

    iput-wide p1, p0, LZ/k;->v:J

    sget-object v0, LZ/r;->a:LZ/r;

    iget-object v1, p0, LZ/k;->d:LZ/q;

    invoke-static {p1, p2}, LW/D;->C(J)I

    move-result p1

    invoke-virtual {v0, v1, p1}, LZ/r;->b(Landroid/view/View;I)V

    :cond_0
    return-void
.end method

.method public final B()F
    .locals 1

    iget v0, p0, LZ/k;->u:F

    return v0
.end method

.method public final C()F
    .locals 1

    iget v0, p0, LZ/k;->r:F

    return v0
.end method

.method public final D()F
    .locals 2

    iget-object v0, p0, LZ/k;->d:LZ/q;

    invoke-virtual {v0}, Landroid/view/View;->getCameraDistance()F

    move-result v0

    iget-object v1, p0, LZ/k;->e:Landroid/content/res/Resources;

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    iget v1, v1, Landroid/util/DisplayMetrics;->densityDpi:I

    int-to-float v1, v1

    div-float/2addr v0, v1

    return v0
.end method

.method public final E()F
    .locals 1

    iget v0, p0, LZ/k;->z:F

    return v0
.end method

.method public final F()I
    .locals 1

    iget v0, p0, LZ/k;->m:I

    return v0
.end method

.method public final G(J)V
    .locals 6

    invoke-static {p1, p2}, Lr2/a;->M(J)Z

    move-result v0

    iget-object v1, p0, LZ/k;->d:LZ/q;

    if-eqz v0, :cond_1

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p2, 0x1c

    if-lt p1, p2, :cond_0

    sget-object p1, LZ/r;->a:LZ/r;

    invoke-virtual {p1, v1}, LZ/r;->a(Landroid/view/View;)V

    goto :goto_0

    :cond_0
    const/4 p1, 0x1

    iput-boolean p1, p0, LZ/k;->p:Z

    iget-wide p1, p0, LZ/k;->i:J

    const/16 v0, 0x20

    shr-long/2addr p1, v0

    long-to-int p1, p1

    int-to-float p1, p1

    const/high16 p2, 0x40000000    # 2.0f

    div-float/2addr p1, p2

    invoke-virtual {v1, p1}, Landroid/view/View;->setPivotX(F)V

    iget-wide v2, p0, LZ/k;->i:J

    const-wide v4, 0xffffffffL

    and-long/2addr v2, v4

    long-to-int p1, v2

    int-to-float p1, p1

    div-float/2addr p1, p2

    invoke-virtual {v1, p1}, Landroid/view/View;->setPivotY(F)V

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    iput-boolean v0, p0, LZ/k;->p:Z

    invoke-static {p1, p2}, LV/c;->b(J)F

    move-result v0

    invoke-virtual {v1, v0}, Landroid/view/View;->setPivotX(F)V

    invoke-static {p1, p2}, LV/c;->c(J)F

    move-result p1

    invoke-virtual {v1, p1}, Landroid/view/View;->setPivotY(F)V

    :goto_0
    return-void
.end method

.method public final H()J
    .locals 2

    iget-wide v0, p0, LZ/k;->v:J

    return-wide v0
.end method

.method public final I()F
    .locals 1

    iget v0, p0, LZ/k;->s:F

    return v0
.end method

.method public final J(Z)V
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eqz p1, :cond_0

    iget-boolean v2, p0, LZ/k;->k:Z

    if-nez v2, :cond_0

    move v2, v1

    goto :goto_0

    :cond_0
    move v2, v0

    :goto_0
    iput-boolean v2, p0, LZ/k;->l:Z

    iput-boolean v1, p0, LZ/k;->j:Z

    if-eqz p1, :cond_1

    iget-boolean p1, p0, LZ/k;->k:Z

    if-eqz p1, :cond_1

    move v0, v1

    :cond_1
    iget-object p1, p0, LZ/k;->d:LZ/q;

    invoke-virtual {p1, v0}, Landroid/view/View;->setClipToOutline(Z)V

    return-void
.end method

.method public final K()I
    .locals 1

    iget v0, p0, LZ/k;->n:I

    return v0
.end method

.method public final L()F
    .locals 1

    iget v0, p0, LZ/k;->x:F

    return v0
.end method

.method public final M(I)V
    .locals 5

    const/4 v0, 0x1

    invoke-static {p1, v0}, LZ/b;->o(II)Z

    move-result v1

    const/4 v2, 0x2

    const/4 v3, 0x0

    iget-object v4, p0, LZ/k;->d:LZ/q;

    if-eqz v1, :cond_0

    invoke-virtual {v4, v2, v3}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    goto :goto_0

    :cond_0
    invoke-static {p1, v2}, LZ/b;->o(II)Z

    move-result p1

    const/4 v1, 0x0

    if-eqz p1, :cond_1

    invoke-virtual {v4, v1, v3}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    move v0, v1

    goto :goto_0

    :cond_1
    invoke-virtual {v4, v1, v3}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    :goto_0
    invoke-virtual {v4, v0}, LZ/q;->setCanUseCompositingLayer$ui_graphics_release(Z)V

    return-void
.end method

.method public final a()F
    .locals 1

    iget v0, p0, LZ/k;->o:F

    return v0
.end method

.method public final b(F)V
    .locals 1

    iput p1, p0, LZ/k;->y:F

    iget-object v0, p0, LZ/k;->d:LZ/q;

    invoke-virtual {v0, p1}, Landroid/view/View;->setRotationY(F)V

    return-void
.end method

.method public final c(F)V
    .locals 1

    iput p1, p0, LZ/k;->s:F

    iget-object v0, p0, LZ/k;->d:LZ/q;

    invoke-virtual {v0, p1}, Landroid/view/View;->setTranslationX(F)V

    return-void
.end method

.method public final d(F)V
    .locals 1

    iput p1, p0, LZ/k;->o:F

    iget-object v0, p0, LZ/k;->d:LZ/q;

    invoke-virtual {v0, p1}, Landroid/view/View;->setAlpha(F)V

    return-void
.end method

.method public final e()Z
    .locals 1

    iget-boolean v0, p0, LZ/k;->l:Z

    if-nez v0, :cond_1

    iget-object v0, p0, LZ/k;->d:LZ/q;

    invoke-virtual {v0}, Landroid/view/View;->getClipToOutline()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public final f(F)V
    .locals 1

    iput p1, p0, LZ/k;->r:F

    iget-object v0, p0, LZ/k;->d:LZ/q;

    invoke-virtual {v0, p1}, Landroid/view/View;->setScaleY(F)V

    return-void
.end method

.method public final g()V
    .locals 3

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1f

    if-lt v0, v1, :cond_0

    sget-object v0, LZ/s;->a:LZ/s;

    iget-object v1, p0, LZ/k;->d:LZ/q;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, LZ/s;->a(Landroid/view/View;LW/E;)V

    :cond_0
    return-void
.end method

.method public final h(F)V
    .locals 1

    iput p1, p0, LZ/k;->z:F

    iget-object v0, p0, LZ/k;->d:LZ/q;

    invoke-virtual {v0, p1}, Landroid/view/View;->setRotation(F)V

    return-void
.end method

.method public final i(F)V
    .locals 1

    iput p1, p0, LZ/k;->t:F

    iget-object v0, p0, LZ/k;->d:LZ/q;

    invoke-virtual {v0, p1}, Landroid/view/View;->setTranslationY(F)V

    return-void
.end method

.method public final j(F)V
    .locals 1

    iget-object v0, p0, LZ/k;->e:Landroid/content/res/Resources;

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->densityDpi:I

    int-to-float v0, v0

    mul-float/2addr p1, v0

    iget-object v0, p0, LZ/k;->d:LZ/q;

    invoke-virtual {v0, p1}, Landroid/view/View;->setCameraDistance(F)V

    return-void
.end method

.method public final l(Landroid/graphics/Outline;)V
    .locals 4

    iget-object v0, p0, LZ/k;->d:LZ/q;

    iput-object p1, v0, LZ/q;->h:Landroid/graphics/Outline;

    invoke-virtual {v0}, Landroid/view/View;->invalidateOutline()V

    invoke-virtual {p0}, LZ/k;->e()Z

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_0

    if-eqz p1, :cond_0

    invoke-virtual {v0, v3}, Landroid/view/View;->setClipToOutline(Z)V

    iget-boolean v0, p0, LZ/k;->l:Z

    if-eqz v0, :cond_0

    iput-boolean v2, p0, LZ/k;->l:Z

    iput-boolean v3, p0, LZ/k;->j:Z

    :cond_0
    if-eqz p1, :cond_1

    move v2, v3

    :cond_1
    iput-boolean v2, p0, LZ/k;->k:Z

    return-void
.end method

.method public final m(F)V
    .locals 1

    iput p1, p0, LZ/k;->q:F

    iget-object v0, p0, LZ/k;->d:LZ/q;

    invoke-virtual {v0, p1}, Landroid/view/View;->setScaleX(F)V

    return-void
.end method

.method public final n(F)V
    .locals 1

    iput p1, p0, LZ/k;->x:F

    iget-object v0, p0, LZ/k;->d:LZ/q;

    invoke-virtual {v0, p1}, Landroid/view/View;->setRotationX(F)V

    return-void
.end method

.method public final o()V
    .locals 2

    iget-object v0, p0, LZ/k;->b:La0/a;

    iget-object v1, p0, LZ/k;->d:LZ/q;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeViewInLayout(Landroid/view/View;)V

    return-void
.end method

.method public final p(I)V
    .locals 2

    iput p1, p0, LZ/k;->n:I

    const/4 v0, 0x1

    invoke-static {p1, v0}, LZ/b;->o(II)Z

    move-result p1

    if-nez p1, :cond_1

    const/4 p1, 0x3

    iget v1, p0, LZ/k;->m:I

    invoke-static {v1, p1}, LW/D;->l(II)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    iget p1, p0, LZ/k;->n:I

    invoke-virtual {p0, p1}, LZ/k;->M(I)V

    goto :goto_1

    :cond_1
    :goto_0
    invoke-virtual {p0, v0}, LZ/k;->M(I)V

    :goto_1
    return-void
.end method

.method public final q(J)V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_0

    iput-wide p1, p0, LZ/k;->w:J

    sget-object v0, LZ/r;->a:LZ/r;

    iget-object v1, p0, LZ/k;->d:LZ/q;

    invoke-static {p1, p2}, LW/D;->C(J)I

    move-result p1

    invoke-virtual {v0, v1, p1}, LZ/r;->c(Landroid/view/View;I)V

    :cond_0
    return-void
.end method

.method public final r()F
    .locals 1

    iget v0, p0, LZ/k;->q:F

    return v0
.end method

.method public final s()Landroid/graphics/Matrix;
    .locals 1

    iget-object v0, p0, LZ/k;->d:LZ/q;

    invoke-virtual {v0}, Landroid/view/View;->getMatrix()Landroid/graphics/Matrix;

    move-result-object v0

    return-object v0
.end method

.method public final t(F)V
    .locals 1

    iput p1, p0, LZ/k;->u:F

    iget-object v0, p0, LZ/k;->d:LZ/q;

    invoke-virtual {v0, p1}, Landroid/view/View;->setElevation(F)V

    return-void
.end method

.method public final u()F
    .locals 1

    iget v0, p0, LZ/k;->t:F

    return v0
.end method

.method public final v(IIJ)V
    .locals 5

    iget-wide v0, p0, LZ/k;->i:J

    invoke-static {v0, v1, p3, p4}, La/a;->x(JJ)Z

    move-result v0

    iget-object v1, p0, LZ/k;->d:LZ/q;

    if-nez v0, :cond_1

    invoke-virtual {p0}, LZ/k;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, LZ/k;->j:Z

    :cond_0
    const/16 v0, 0x20

    shr-long v2, p3, v0

    long-to-int v0, v2

    add-int v2, p1, v0

    const-wide v3, 0xffffffffL

    and-long/2addr v3, p3

    long-to-int v3, v3

    add-int v4, p2, v3

    invoke-virtual {v1, p1, p2, v2, v4}, Landroid/view/View;->layout(IIII)V

    iput-wide p3, p0, LZ/k;->i:J

    iget-boolean p3, p0, LZ/k;->p:Z

    if-eqz p3, :cond_3

    int-to-float p3, v0

    const/high16 p4, 0x40000000    # 2.0f

    div-float/2addr p3, p4

    invoke-virtual {v1, p3}, Landroid/view/View;->setPivotX(F)V

    int-to-float p3, v3

    div-float/2addr p3, p4

    invoke-virtual {v1, p3}, Landroid/view/View;->setPivotY(F)V

    goto :goto_0

    :cond_1
    iget p3, p0, LZ/k;->g:I

    if-eq p3, p1, :cond_2

    sub-int p3, p1, p3

    invoke-virtual {v1, p3}, Landroid/view/View;->offsetLeftAndRight(I)V

    :cond_2
    iget p3, p0, LZ/k;->h:I

    if-eq p3, p2, :cond_3

    sub-int p3, p2, p3

    invoke-virtual {v1, p3}, Landroid/view/View;->offsetTopAndBottom(I)V

    :cond_3
    :goto_0
    iput p1, p0, LZ/k;->g:I

    iput p2, p0, LZ/k;->h:I

    return-void
.end method

.method public final w()F
    .locals 1

    iget v0, p0, LZ/k;->y:F

    return v0
.end method

.method public final x(LW/o;)V
    .locals 4

    iget-boolean v0, p0, LZ/k;->j:Z

    iget-object v1, p0, LZ/k;->d:LZ/q;

    if-eqz v0, :cond_1

    invoke-virtual {p0}, LZ/k;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, LZ/k;->k:Z

    if-nez v0, :cond_0

    iget-object v0, p0, LZ/k;->f:Landroid/graphics/Rect;

    const/4 v2, 0x0

    iput v2, v0, Landroid/graphics/Rect;->left:I

    iput v2, v0, Landroid/graphics/Rect;->top:I

    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    move-result v2

    iput v2, v0, Landroid/graphics/Rect;->right:I

    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    move-result v2

    iput v2, v0, Landroid/graphics/Rect;->bottom:I

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v1, v0}, Landroid/view/View;->setClipBounds(Landroid/graphics/Rect;)V

    :cond_1
    invoke-static {p1}, LW/d;->a(LW/o;)Landroid/graphics/Canvas;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/Canvas;->isHardwareAccelerated()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {v1}, Landroid/view/View;->getDrawingTime()J

    move-result-wide v2

    iget-object v0, p0, LZ/k;->b:La0/a;

    invoke-virtual {v0, p1, v1, v2, v3}, La0/a;->a(LW/o;Landroid/view/View;J)V

    :cond_2
    return-void
.end method

.method public final y(LG0/b;LG0/f;LZ/d;Lo2/c;)V
    .locals 5

    iget-object v0, p0, LZ/k;->d:LZ/q;

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    iget-object v2, p0, LZ/k;->b:La0/a;

    if-nez v1, :cond_0

    invoke-virtual {v2, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    :cond_0
    iput-object p1, v0, LZ/q;->j:LG0/b;

    iput-object p2, v0, LZ/q;->k:LG0/f;

    check-cast p4, Lp2/h;

    iput-object p4, v0, LZ/q;->l:Lp2/h;

    iput-object p3, v0, LZ/q;->m:LZ/d;

    invoke-virtual {v0}, Landroid/view/View;->isAttachedToWindow()Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x4

    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    const/4 p1, 0x0

    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    :try_start_0
    iget-object p1, p0, LZ/k;->c:LW/p;

    sget-object p2, LZ/k;->A:LZ/j;

    iget-object p3, p1, LW/p;->a:LW/c;

    iget-object p4, p3, LW/c;->a:Landroid/graphics/Canvas;

    iput-object p2, p3, LW/c;->a:Landroid/graphics/Canvas;

    invoke-virtual {v0}, Landroid/view/View;->getDrawingTime()J

    move-result-wide v3

    invoke-virtual {v2, p3, v0, v3, v4}, La0/a;->a(LW/o;Landroid/view/View;J)V

    iget-object p1, p1, LW/p;->a:LW/c;

    iput-object p4, p1, LW/c;->a:Landroid/graphics/Canvas;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_1
    return-void
.end method

.method public final z()J
    .locals 2

    iget-wide v0, p0, LZ/k;->w:J

    return-wide v0
.end method
