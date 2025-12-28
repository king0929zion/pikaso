.class public final LZ/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZ/f;


# static fields
.field public static final z:Ljava/util/concurrent/atomic/AtomicBoolean;


# instance fields
.field public final b:LW/p;

.field public final c:LY/b;

.field public final d:Landroid/view/RenderNode;

.field public e:J

.field public f:Landroid/graphics/Matrix;

.field public g:Z

.field public h:I

.field public final i:I

.field public j:F

.field public k:Z

.field public l:F

.field public m:F

.field public n:F

.field public o:F

.field public p:F

.field public q:J

.field public r:J

.field public s:F

.field public t:F

.field public u:F

.field public v:F

.field public w:Z

.field public x:Z

.field public y:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    sput-object v0, LZ/g;->z:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-void
.end method

.method public constructor <init>(Lo0/u;LW/p;LY/b;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LZ/g;->b:LW/p;

    iput-object p3, p0, LZ/g;->c:LY/b;

    const-string p2, "Compose"

    invoke-static {p2, p1}, Landroid/view/RenderNode;->create(Ljava/lang/String;Landroid/view/View;)Landroid/view/RenderNode;

    move-result-object p1

    iput-object p1, p0, LZ/g;->d:Landroid/view/RenderNode;

    const-wide/16 p2, 0x0

    iput-wide p2, p0, LZ/g;->e:J

    sget-object p2, LZ/g;->z:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 p3, 0x0

    invoke-virtual {p2, p3}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-virtual {p1}, Landroid/view/RenderNode;->getScaleX()F

    move-result p2

    invoke-virtual {p1, p2}, Landroid/view/RenderNode;->setScaleX(F)Z

    invoke-virtual {p1}, Landroid/view/RenderNode;->getScaleY()F

    move-result p2

    invoke-virtual {p1, p2}, Landroid/view/RenderNode;->setScaleY(F)Z

    invoke-virtual {p1}, Landroid/view/RenderNode;->getTranslationX()F

    move-result p2

    invoke-virtual {p1, p2}, Landroid/view/RenderNode;->setTranslationX(F)Z

    invoke-virtual {p1}, Landroid/view/RenderNode;->getTranslationY()F

    move-result p2

    invoke-virtual {p1, p2}, Landroid/view/RenderNode;->setTranslationY(F)Z

    invoke-virtual {p1}, Landroid/view/RenderNode;->getElevation()F

    move-result p2

    invoke-virtual {p1, p2}, Landroid/view/RenderNode;->setElevation(F)Z

    invoke-virtual {p1}, Landroid/view/RenderNode;->getRotation()F

    move-result p2

    invoke-virtual {p1, p2}, Landroid/view/RenderNode;->setRotation(F)Z

    invoke-virtual {p1}, Landroid/view/RenderNode;->getRotationX()F

    move-result p2

    invoke-virtual {p1, p2}, Landroid/view/RenderNode;->setRotationX(F)Z

    invoke-virtual {p1}, Landroid/view/RenderNode;->getRotationY()F

    move-result p2

    invoke-virtual {p1, p2}, Landroid/view/RenderNode;->setRotationY(F)Z

    invoke-virtual {p1}, Landroid/view/RenderNode;->getCameraDistance()F

    move-result p2

    invoke-virtual {p1, p2}, Landroid/view/RenderNode;->setCameraDistance(F)Z

    invoke-virtual {p1}, Landroid/view/RenderNode;->getPivotX()F

    move-result p2

    invoke-virtual {p1, p2}, Landroid/view/RenderNode;->setPivotX(F)Z

    invoke-virtual {p1}, Landroid/view/RenderNode;->getPivotY()F

    move-result p2

    invoke-virtual {p1, p2}, Landroid/view/RenderNode;->setPivotY(F)Z

    invoke-virtual {p1}, Landroid/view/RenderNode;->getClipToOutline()Z

    move-result p2

    invoke-virtual {p1, p2}, Landroid/view/RenderNode;->setClipToOutline(Z)Z

    invoke-virtual {p1, p3}, Landroid/view/RenderNode;->setClipToBounds(Z)Z

    invoke-virtual {p1}, Landroid/view/RenderNode;->getAlpha()F

    move-result p2

    invoke-virtual {p1, p2}, Landroid/view/RenderNode;->setAlpha(F)Z

    invoke-virtual {p1}, Landroid/view/RenderNode;->isValid()Z

    invoke-virtual {p1, p3, p3, p3, p3}, Landroid/view/RenderNode;->setLeftTopRightBottom(IIII)Z

    invoke-virtual {p1, p3}, Landroid/view/RenderNode;->offsetLeftAndRight(I)Z

    invoke-virtual {p1, p3}, Landroid/view/RenderNode;->offsetTopAndBottom(I)Z

    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x1c

    if-lt p2, v0, :cond_0

    sget-object p2, LZ/n;->a:LZ/n;

    invoke-virtual {p2, p1}, LZ/n;->a(Landroid/view/RenderNode;)I

    move-result v0

    invoke-virtual {p2, p1, v0}, LZ/n;->c(Landroid/view/RenderNode;I)V

    invoke-virtual {p2, p1}, LZ/n;->b(Landroid/view/RenderNode;)I

    move-result v0

    invoke-virtual {p2, p1, v0}, LZ/n;->d(Landroid/view/RenderNode;I)V

    :cond_0
    sget-object p2, LZ/m;->a:LZ/m;

    invoke-virtual {p2, p1}, LZ/m;->a(Landroid/view/RenderNode;)V

    invoke-virtual {p1, p3}, Landroid/view/RenderNode;->setLayerType(I)Z

    invoke-virtual {p1}, Landroid/view/RenderNode;->hasOverlappingRendering()Z

    move-result p2

    invoke-virtual {p1, p2}, Landroid/view/RenderNode;->setHasOverlappingRendering(Z)Z

    :cond_1
    invoke-virtual {p1, p3}, Landroid/view/RenderNode;->setClipToBounds(Z)Z

    invoke-virtual {p0, p3}, LZ/g;->N(I)V

    iput p3, p0, LZ/g;->h:I

    const/4 p1, 0x3

    iput p1, p0, LZ/g;->i:I

    const/high16 p1, 0x3f800000    # 1.0f

    iput p1, p0, LZ/g;->j:F

    iput p1, p0, LZ/g;->l:F

    iput p1, p0, LZ/g;->m:F

    sget p1, LW/r;->g:I

    invoke-static {}, LW/D;->r()J

    move-result-wide p1

    iput-wide p1, p0, LZ/g;->q:J

    invoke-static {}, LW/D;->r()J

    move-result-wide p1

    iput-wide p1, p0, LZ/g;->r:J

    const/high16 p1, 0x41000000    # 8.0f

    iput p1, p0, LZ/g;->v:F

    return-void
.end method


# virtual methods
.method public final A(J)V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_0

    iput-wide p1, p0, LZ/g;->q:J

    sget-object v0, LZ/n;->a:LZ/n;

    iget-object v1, p0, LZ/g;->d:Landroid/view/RenderNode;

    invoke-static {p1, p2}, LW/D;->C(J)I

    move-result p1

    invoke-virtual {v0, v1, p1}, LZ/n;->c(Landroid/view/RenderNode;I)V

    :cond_0
    return-void
.end method

.method public final B()F
    .locals 1

    iget v0, p0, LZ/g;->p:F

    return v0
.end method

.method public final C()F
    .locals 1

    iget v0, p0, LZ/g;->m:F

    return v0
.end method

.method public final D()F
    .locals 1

    iget v0, p0, LZ/g;->v:F

    return v0
.end method

.method public final E()F
    .locals 1

    iget v0, p0, LZ/g;->u:F

    return v0
.end method

.method public final F()I
    .locals 1

    iget v0, p0, LZ/g;->i:I

    return v0
.end method

.method public final G(J)V
    .locals 3

    invoke-static {p1, p2}, Lr2/a;->M(J)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    iput-boolean p1, p0, LZ/g;->k:Z

    iget-object p1, p0, LZ/g;->d:Landroid/view/RenderNode;

    iget-wide v0, p0, LZ/g;->e:J

    invoke-static {v0, v1}, La/a;->N(J)I

    move-result p2

    int-to-float p2, p2

    const/high16 v0, 0x40000000    # 2.0f

    div-float/2addr p2, v0

    invoke-virtual {p1, p2}, Landroid/view/RenderNode;->setPivotX(F)Z

    iget-object p1, p0, LZ/g;->d:Landroid/view/RenderNode;

    iget-wide v1, p0, LZ/g;->e:J

    invoke-static {v1, v2}, La/a;->I(J)I

    move-result p2

    int-to-float p2, p2

    div-float/2addr p2, v0

    invoke-virtual {p1, p2}, Landroid/view/RenderNode;->setPivotY(F)Z

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, LZ/g;->k:Z

    iget-object v0, p0, LZ/g;->d:Landroid/view/RenderNode;

    invoke-static {p1, p2}, LV/c;->b(J)F

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/RenderNode;->setPivotX(F)Z

    iget-object v0, p0, LZ/g;->d:Landroid/view/RenderNode;

    invoke-static {p1, p2}, LV/c;->c(J)F

    move-result p1

    invoke-virtual {v0, p1}, Landroid/view/RenderNode;->setPivotY(F)Z

    :goto_0
    return-void
.end method

.method public final H()J
    .locals 2

    iget-wide v0, p0, LZ/g;->q:J

    return-wide v0
.end method

.method public final I()F
    .locals 1

    iget v0, p0, LZ/g;->n:F

    return v0
.end method

.method public final J(Z)V
    .locals 0

    iput-boolean p1, p0, LZ/g;->w:Z

    invoke-virtual {p0}, LZ/g;->M()V

    return-void
.end method

.method public final K()I
    .locals 1

    iget v0, p0, LZ/g;->h:I

    return v0
.end method

.method public final L()F
    .locals 1

    iget v0, p0, LZ/g;->s:F

    return v0
.end method

.method public final M()V
    .locals 4

    iget-boolean v0, p0, LZ/g;->w:Z

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    iget-boolean v3, p0, LZ/g;->g:Z

    if-nez v3, :cond_0

    move v3, v2

    goto :goto_0

    :cond_0
    move v3, v1

    :goto_0
    if-eqz v0, :cond_1

    iget-boolean v0, p0, LZ/g;->g:Z

    if-eqz v0, :cond_1

    move v1, v2

    :cond_1
    iget-boolean v0, p0, LZ/g;->x:Z

    if-eq v3, v0, :cond_2

    iput-boolean v3, p0, LZ/g;->x:Z

    iget-object v0, p0, LZ/g;->d:Landroid/view/RenderNode;

    invoke-virtual {v0, v3}, Landroid/view/RenderNode;->setClipToBounds(Z)Z

    :cond_2
    iget-boolean v0, p0, LZ/g;->y:Z

    if-eq v1, v0, :cond_3

    iput-boolean v1, p0, LZ/g;->y:Z

    iget-object v0, p0, LZ/g;->d:Landroid/view/RenderNode;

    invoke-virtual {v0, v1}, Landroid/view/RenderNode;->setClipToOutline(Z)Z

    :cond_3
    return-void
.end method

.method public final N(I)V
    .locals 5

    iget-object v0, p0, LZ/g;->d:Landroid/view/RenderNode;

    const/4 v1, 0x1

    invoke-static {p1, v1}, LZ/b;->o(II)Z

    move-result v2

    const/4 v3, 0x2

    const/4 v4, 0x0

    if-eqz v2, :cond_0

    invoke-virtual {v0, v3}, Landroid/view/RenderNode;->setLayerType(I)Z

    invoke-virtual {v0, v4}, Landroid/view/RenderNode;->setLayerPaint(Landroid/graphics/Paint;)Z

    invoke-virtual {v0, v1}, Landroid/view/RenderNode;->setHasOverlappingRendering(Z)Z

    goto :goto_0

    :cond_0
    invoke-static {p1, v3}, LZ/b;->o(II)Z

    move-result p1

    const/4 v2, 0x0

    if-eqz p1, :cond_1

    invoke-virtual {v0, v2}, Landroid/view/RenderNode;->setLayerType(I)Z

    invoke-virtual {v0, v4}, Landroid/view/RenderNode;->setLayerPaint(Landroid/graphics/Paint;)Z

    invoke-virtual {v0, v2}, Landroid/view/RenderNode;->setHasOverlappingRendering(Z)Z

    goto :goto_0

    :cond_1
    invoke-virtual {v0, v2}, Landroid/view/RenderNode;->setLayerType(I)Z

    invoke-virtual {v0, v4}, Landroid/view/RenderNode;->setLayerPaint(Landroid/graphics/Paint;)Z

    invoke-virtual {v0, v1}, Landroid/view/RenderNode;->setHasOverlappingRendering(Z)Z

    :goto_0
    return-void
.end method

.method public final a()F
    .locals 1

    iget v0, p0, LZ/g;->j:F

    return v0
.end method

.method public final b(F)V
    .locals 1

    iput p1, p0, LZ/g;->t:F

    iget-object v0, p0, LZ/g;->d:Landroid/view/RenderNode;

    invoke-virtual {v0, p1}, Landroid/view/RenderNode;->setRotationY(F)Z

    return-void
.end method

.method public final c(F)V
    .locals 1

    iput p1, p0, LZ/g;->n:F

    iget-object v0, p0, LZ/g;->d:Landroid/view/RenderNode;

    invoke-virtual {v0, p1}, Landroid/view/RenderNode;->setTranslationX(F)Z

    return-void
.end method

.method public final d(F)V
    .locals 1

    iput p1, p0, LZ/g;->j:F

    iget-object v0, p0, LZ/g;->d:Landroid/view/RenderNode;

    invoke-virtual {v0, p1}, Landroid/view/RenderNode;->setAlpha(F)Z

    return-void
.end method

.method public final e()Z
    .locals 1

    iget-boolean v0, p0, LZ/g;->w:Z

    return v0
.end method

.method public final f(F)V
    .locals 1

    iput p1, p0, LZ/g;->m:F

    iget-object v0, p0, LZ/g;->d:Landroid/view/RenderNode;

    invoke-virtual {v0, p1}, Landroid/view/RenderNode;->setScaleY(F)Z

    return-void
.end method

.method public final g()V
    .locals 0

    return-void
.end method

.method public final h(F)V
    .locals 1

    iput p1, p0, LZ/g;->u:F

    iget-object v0, p0, LZ/g;->d:Landroid/view/RenderNode;

    invoke-virtual {v0, p1}, Landroid/view/RenderNode;->setRotation(F)Z

    return-void
.end method

.method public final i(F)V
    .locals 1

    iput p1, p0, LZ/g;->o:F

    iget-object v0, p0, LZ/g;->d:Landroid/view/RenderNode;

    invoke-virtual {v0, p1}, Landroid/view/RenderNode;->setTranslationY(F)Z

    return-void
.end method

.method public final j(F)V
    .locals 1

    iput p1, p0, LZ/g;->v:F

    iget-object v0, p0, LZ/g;->d:Landroid/view/RenderNode;

    neg-float p1, p1

    invoke-virtual {v0, p1}, Landroid/view/RenderNode;->setCameraDistance(F)Z

    return-void
.end method

.method public final k()Z
    .locals 1

    iget-object v0, p0, LZ/g;->d:Landroid/view/RenderNode;

    invoke-virtual {v0}, Landroid/view/RenderNode;->isValid()Z

    move-result v0

    return v0
.end method

.method public final l(Landroid/graphics/Outline;)V
    .locals 1

    iget-object v0, p0, LZ/g;->d:Landroid/view/RenderNode;

    invoke-virtual {v0, p1}, Landroid/view/RenderNode;->setOutline(Landroid/graphics/Outline;)Z

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p0, LZ/g;->g:Z

    invoke-virtual {p0}, LZ/g;->M()V

    return-void
.end method

.method public final m(F)V
    .locals 1

    iput p1, p0, LZ/g;->l:F

    iget-object v0, p0, LZ/g;->d:Landroid/view/RenderNode;

    invoke-virtual {v0, p1}, Landroid/view/RenderNode;->setScaleX(F)Z

    return-void
.end method

.method public final n(F)V
    .locals 1

    iput p1, p0, LZ/g;->s:F

    iget-object v0, p0, LZ/g;->d:Landroid/view/RenderNode;

    invoke-virtual {v0, p1}, Landroid/view/RenderNode;->setRotationX(F)Z

    return-void
.end method

.method public final o()V
    .locals 2

    sget-object v0, LZ/m;->a:LZ/m;

    iget-object v1, p0, LZ/g;->d:Landroid/view/RenderNode;

    invoke-virtual {v0, v1}, LZ/m;->a(Landroid/view/RenderNode;)V

    return-void
.end method

.method public final p(I)V
    .locals 2

    iput p1, p0, LZ/g;->h:I

    const/4 v0, 0x1

    invoke-static {p1, v0}, LZ/b;->o(II)Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x3

    iget v1, p0, LZ/g;->i:I

    invoke-static {v1, p1}, LW/D;->l(II)Z

    move-result p1

    if-eqz p1, :cond_0

    iget p1, p0, LZ/g;->h:I

    invoke-virtual {p0, p1}, LZ/g;->N(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0, v0}, LZ/g;->N(I)V

    :goto_0
    return-void
.end method

.method public final q(J)V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_0

    iput-wide p1, p0, LZ/g;->r:J

    sget-object v0, LZ/n;->a:LZ/n;

    iget-object v1, p0, LZ/g;->d:Landroid/view/RenderNode;

    invoke-static {p1, p2}, LW/D;->C(J)I

    move-result p1

    invoke-virtual {v0, v1, p1}, LZ/n;->d(Landroid/view/RenderNode;I)V

    :cond_0
    return-void
.end method

.method public final r()F
    .locals 1

    iget v0, p0, LZ/g;->l:F

    return v0
.end method

.method public final s()Landroid/graphics/Matrix;
    .locals 2

    iget-object v0, p0, LZ/g;->f:Landroid/graphics/Matrix;

    if-nez v0, :cond_0

    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, LZ/g;->f:Landroid/graphics/Matrix;

    :cond_0
    iget-object v1, p0, LZ/g;->d:Landroid/view/RenderNode;

    invoke-virtual {v1, v0}, Landroid/view/RenderNode;->getMatrix(Landroid/graphics/Matrix;)V

    return-object v0
.end method

.method public final t(F)V
    .locals 1

    iput p1, p0, LZ/g;->p:F

    iget-object v0, p0, LZ/g;->d:Landroid/view/RenderNode;

    invoke-virtual {v0, p1}, Landroid/view/RenderNode;->setElevation(F)Z

    return-void
.end method

.method public final u()F
    .locals 1

    iget v0, p0, LZ/g;->o:F

    return v0
.end method

.method public final v(IIJ)V
    .locals 3

    iget-object v0, p0, LZ/g;->d:Landroid/view/RenderNode;

    invoke-static {p3, p4}, La/a;->N(J)I

    move-result v1

    add-int/2addr v1, p1

    invoke-static {p3, p4}, La/a;->I(J)I

    move-result v2

    add-int/2addr v2, p2

    invoke-virtual {v0, p1, p2, v1, v2}, Landroid/view/RenderNode;->setLeftTopRightBottom(IIII)Z

    iget-wide p1, p0, LZ/g;->e:J

    invoke-static {p1, p2, p3, p4}, La/a;->x(JJ)Z

    move-result p1

    if-nez p1, :cond_1

    iget-boolean p1, p0, LZ/g;->k:Z

    if-eqz p1, :cond_0

    iget-object p1, p0, LZ/g;->d:Landroid/view/RenderNode;

    invoke-static {p3, p4}, La/a;->N(J)I

    move-result p2

    int-to-float p2, p2

    const/high16 v0, 0x40000000    # 2.0f

    div-float/2addr p2, v0

    invoke-virtual {p1, p2}, Landroid/view/RenderNode;->setPivotX(F)Z

    iget-object p1, p0, LZ/g;->d:Landroid/view/RenderNode;

    invoke-static {p3, p4}, La/a;->I(J)I

    move-result p2

    int-to-float p2, p2

    div-float/2addr p2, v0

    invoke-virtual {p1, p2}, Landroid/view/RenderNode;->setPivotY(F)Z

    :cond_0
    iput-wide p3, p0, LZ/g;->e:J

    :cond_1
    return-void
.end method

.method public final w()F
    .locals 1

    iget v0, p0, LZ/g;->t:F

    return v0
.end method

.method public final x(LW/o;)V
    .locals 1

    invoke-static {p1}, LW/d;->a(LW/o;)Landroid/graphics/Canvas;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type android.view.DisplayListCanvas"

    invoke-static {p1, v0}, Lp2/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroid/view/DisplayListCanvas;

    iget-object v0, p0, LZ/g;->d:Landroid/view/RenderNode;

    invoke-virtual {p1, v0}, Landroid/view/DisplayListCanvas;->drawRenderNode(Landroid/view/RenderNode;)V

    return-void
.end method

.method public final y(LG0/b;LG0/f;LZ/d;Lo2/c;)V
    .locals 16

    move-object/from16 v1, p0

    iget-object v0, v1, LZ/g;->d:Landroid/view/RenderNode;

    iget-wide v2, v1, LZ/g;->e:J

    invoke-static {v2, v3}, La/a;->N(J)I

    move-result v2

    iget-wide v3, v1, LZ/g;->e:J

    invoke-static {v3, v4}, La/a;->I(J)I

    move-result v3

    invoke-virtual {v0, v2, v3}, Landroid/view/RenderNode;->start(II)Landroid/view/DisplayListCanvas;

    move-result-object v2

    :try_start_0
    iget-object v0, v1, LZ/g;->b:LW/p;

    invoke-virtual {v0}, LW/p;->a()LW/c;

    move-result-object v3

    invoke-virtual {v3}, LW/c;->r()Landroid/graphics/Canvas;

    move-result-object v3

    invoke-virtual {v0}, LW/p;->a()LW/c;

    move-result-object v4

    move-object v5, v2

    check-cast v5, Landroid/graphics/Canvas;

    invoke-virtual {v4, v5}, LW/c;->s(Landroid/graphics/Canvas;)V

    invoke-virtual {v0}, LW/p;->a()LW/c;

    move-result-object v4

    iget-object v5, v1, LZ/g;->c:LY/b;

    iget-wide v6, v1, LZ/g;->e:J

    invoke-static {v6, v7}, Lr2/a;->c0(J)J

    move-result-wide v6

    invoke-virtual {v5}, LY/b;->H()LB0/a;

    move-result-object v8

    invoke-virtual {v8}, LB0/a;->l()LG0/b;

    move-result-object v8

    invoke-virtual {v5}, LY/b;->H()LB0/a;

    move-result-object v9

    invoke-virtual {v9}, LB0/a;->p()LG0/f;

    move-result-object v9

    invoke-virtual {v5}, LY/b;->H()LB0/a;

    move-result-object v10

    invoke-virtual {v10}, LB0/a;->j()LW/o;

    move-result-object v10

    invoke-virtual {v5}, LY/b;->H()LB0/a;

    move-result-object v11

    invoke-virtual {v11}, LB0/a;->r()J

    move-result-wide v11

    invoke-virtual {v5}, LY/b;->H()LB0/a;

    move-result-object v13

    invoke-virtual {v13}, LB0/a;->o()LZ/d;

    move-result-object v13

    invoke-virtual {v5}, LY/b;->H()LB0/a;

    move-result-object v14

    move-object/from16 v15, p1

    invoke-virtual {v14, v15}, LB0/a;->G(LG0/b;)V

    move-object/from16 v15, p2

    invoke-virtual {v14, v15}, LB0/a;->I(LG0/f;)V

    invoke-virtual {v14, v4}, LB0/a;->F(LW/o;)V

    invoke-virtual {v14, v6, v7}, LB0/a;->J(J)V

    move-object/from16 v6, p3

    invoke-virtual {v14, v6}, LB0/a;->H(LZ/d;)V

    invoke-virtual {v4}, LW/c;->d()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object/from16 v6, p4

    :try_start_1
    invoke-interface {v6, v5}, Lo2/c;->i(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    invoke-virtual {v4}, LW/c;->a()V

    invoke-virtual {v5}, LY/b;->H()LB0/a;

    move-result-object v4

    invoke-virtual {v4, v8}, LB0/a;->G(LG0/b;)V

    invoke-virtual {v4, v9}, LB0/a;->I(LG0/f;)V

    invoke-virtual {v4, v10}, LB0/a;->F(LW/o;)V

    invoke-virtual {v4, v11, v12}, LB0/a;->J(J)V

    invoke-virtual {v4, v13}, LB0/a;->H(LZ/d;)V

    invoke-virtual {v0}, LW/p;->a()LW/c;

    move-result-object v0

    invoke-virtual {v0, v3}, LW/c;->s(Landroid/graphics/Canvas;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    iget-object v0, v1, LZ/g;->d:Landroid/view/RenderNode;

    invoke-virtual {v0, v2}, Landroid/view/RenderNode;->end(Landroid/view/DisplayListCanvas;)V

    return-void

    :catchall_0
    move-exception v0

    goto :goto_0

    :catchall_1
    move-exception v0

    move-object v3, v0

    :try_start_3
    invoke-virtual {v4}, LW/c;->a()V

    invoke-virtual {v5}, LY/b;->H()LB0/a;

    move-result-object v0

    invoke-virtual {v0, v8}, LB0/a;->G(LG0/b;)V

    invoke-virtual {v0, v9}, LB0/a;->I(LG0/f;)V

    invoke-virtual {v0, v10}, LB0/a;->F(LW/o;)V

    invoke-virtual {v0, v11, v12}, LB0/a;->J(J)V

    invoke-virtual {v0, v13}, LB0/a;->H(LZ/d;)V

    throw v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :goto_0
    iget-object v3, v1, LZ/g;->d:Landroid/view/RenderNode;

    invoke-virtual {v3, v2}, Landroid/view/RenderNode;->end(Landroid/view/DisplayListCanvas;)V

    throw v0
.end method

.method public final z()J
    .locals 2

    iget-wide v0, p0, LZ/g;->r:J

    return-wide v0
.end method
