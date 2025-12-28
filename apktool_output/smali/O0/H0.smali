.class public final Lo0/H0;
.super Landroid/view/View;
.source "SourceFile"

# interfaces
.implements Ln0/d0;


# static fields
.field public static final s:LZ/p;

.field public static t:Ljava/lang/reflect/Method;

.field public static u:Ljava/lang/reflect/Field;

.field public static v:Z

.field public static w:Z


# instance fields
.field public final d:Lo0/u;

.field public final e:Lo0/k0;

.field public f:LA/i;

.field public g:LA0/c;

.field public final h:Lo0/r0;

.field public i:Z

.field public j:Landroid/graphics/Rect;

.field public k:Z

.field public l:Z

.field public final m:LW/p;

.field public final n:Lo0/o0;

.field public o:J

.field public p:Z

.field public final q:J

.field public r:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LZ/p;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, LZ/p;-><init>(I)V

    sput-object v0, Lo0/H0;->s:LZ/p;

    return-void
.end method

.method public constructor <init>(Lo0/u;Lo0/k0;LA/i;LA0/c;)V
    .locals 1

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p0, v0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lo0/H0;->d:Lo0/u;

    iput-object p2, p0, Lo0/H0;->e:Lo0/k0;

    iput-object p3, p0, Lo0/H0;->f:LA/i;

    iput-object p4, p0, Lo0/H0;->g:LA0/c;

    new-instance p1, Lo0/r0;

    invoke-direct {p1}, Lo0/r0;-><init>()V

    iput-object p1, p0, Lo0/H0;->h:Lo0/r0;

    new-instance p1, LW/p;

    invoke-direct {p1}, LW/p;-><init>()V

    iput-object p1, p0, Lo0/H0;->m:LW/p;

    new-instance p1, Lo0/o0;

    sget-object p3, Lo0/D;->i:Lo0/D;

    invoke-direct {p1, p3}, Lo0/o0;-><init>(Lo2/e;)V

    iput-object p1, p0, Lo0/H0;->n:Lo0/o0;

    sget-wide p3, LW/K;->a:J

    iput-wide p3, p0, Lo0/H0;->o:J

    const/4 p1, 0x1

    iput-boolean p1, p0, Lo0/H0;->p:Z

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Landroid/view/View;->setWillNotDraw(Z)V

    invoke-virtual {p2, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-static {}, Landroid/view/View;->generateViewId()I

    move-result p1

    int-to-long p1, p1

    iput-wide p1, p0, Lo0/H0;->q:J

    return-void
.end method

.method private final getManualClipPath()LW/C;
    .locals 2

    invoke-virtual {p0}, Landroid/view/View;->getClipToOutline()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lo0/H0;->h:Lo0/r0;

    iget-boolean v1, v0, Lo0/r0;->g:Z

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lo0/r0;->d()V

    iget-object v0, v0, Lo0/r0;->e:LW/C;

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x0

    :goto_1
    return-object v0
.end method

.method private final setInvalidated(Z)V
    .locals 1

    iget-boolean v0, p0, Lo0/H0;->k:Z

    if-eq p1, v0, :cond_0

    iput-boolean p1, p0, Lo0/H0;->k:Z

    iget-object v0, p0, Lo0/H0;->d:Lo0/u;

    invoke-virtual {v0, p0, p1}, Lo0/u;->t(Ln0/d0;Z)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lo0/H0;->setInvalidated(Z)V

    iget-object v0, p0, Lo0/H0;->d:Lo0/u;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lo0/u;->B:Z

    const/4 v1, 0x0

    iput-object v1, p0, Lo0/H0;->f:LA/i;

    iput-object v1, p0, Lo0/H0;->g:LA0/c;

    invoke-virtual {v0, p0}, Lo0/u;->B(Ln0/d0;)V

    iget-object v0, p0, Lo0/H0;->e:Lo0/k0;

    invoke-virtual {v0, p0}, Landroid/view/ViewGroup;->removeViewInLayout(Landroid/view/View;)V

    return-void
.end method

.method public final b(JZ)J
    .locals 1

    iget-object v0, p0, Lo0/H0;->n:Lo0/o0;

    if-eqz p3, :cond_1

    invoke-virtual {v0, p0}, Lo0/o0;->a(Ljava/lang/Object;)[F

    move-result-object p3

    if-eqz p3, :cond_0

    invoke-static {p3, p1, p2}, LW/D;->t([FJ)J

    move-result-wide p1

    goto :goto_0

    :cond_0
    const-wide p1, 0x7f8000007f800000L    # 1.404448428688076E306

    goto :goto_0

    :cond_1
    invoke-virtual {v0, p0}, Lo0/o0;->b(Ljava/lang/Object;)[F

    move-result-object p3

    invoke-static {p3, p1, p2}, LW/D;->t([FJ)J

    move-result-wide p1

    :goto_0
    return-wide p1
.end method

.method public final c(J)V
    .locals 3

    const/16 v0, 0x20

    shr-long v0, p1, v0

    long-to-int v0, v0

    invoke-virtual {p0}, Landroid/view/View;->getLeft()I

    move-result v1

    iget-object v2, p0, Lo0/H0;->n:Lo0/o0;

    if-eq v0, v1, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->getLeft()I

    move-result v1

    sub-int/2addr v0, v1

    invoke-virtual {p0, v0}, Landroid/view/View;->offsetLeftAndRight(I)V

    invoke-virtual {v2}, Lo0/o0;->c()V

    :cond_0
    const-wide v0, 0xffffffffL

    and-long/2addr p1, v0

    long-to-int p1, p1

    invoke-virtual {p0}, Landroid/view/View;->getTop()I

    move-result p2

    if-eq p1, p2, :cond_1

    invoke-virtual {p0}, Landroid/view/View;->getTop()I

    move-result p2

    sub-int/2addr p1, p2

    invoke-virtual {p0, p1}, Landroid/view/View;->offsetTopAndBottom(I)V

    invoke-virtual {v2}, Lo0/o0;->c()V

    :cond_1
    return-void
.end method

.method public final d()V
    .locals 1

    iget-boolean v0, p0, Lo0/H0;->k:Z

    if-eqz v0, :cond_0

    sget-boolean v0, Lo0/H0;->w:Z

    if-nez v0, :cond_0

    invoke-static {p0}, Lo0/K;->q(Landroid/view/View;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lo0/H0;->setInvalidated(Z)V

    :cond_0
    return-void
.end method

.method public final dispatchDraw(Landroid/graphics/Canvas;)V
    .locals 6

    iget-object v0, p0, Lo0/H0;->m:LW/p;

    iget-object v1, v0, LW/p;->a:LW/c;

    iget-object v2, v1, LW/c;->a:Landroid/graphics/Canvas;

    iput-object p1, v1, LW/c;->a:Landroid/graphics/Canvas;

    invoke-direct {p0}, Lo0/H0;->getManualClipPath()LW/C;

    move-result-object v3

    const/4 v4, 0x0

    if-nez v3, :cond_1

    invoke-virtual {p1}, Landroid/graphics/Canvas;->isHardwareAccelerated()Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    move p1, v4

    goto :goto_1

    :cond_1
    :goto_0
    invoke-virtual {v1}, LW/c;->d()V

    iget-object p1, p0, Lo0/H0;->h:Lo0/r0;

    invoke-virtual {p1, v1}, Lo0/r0;->a(LW/o;)V

    const/4 p1, 0x1

    :goto_1
    iget-object v3, p0, Lo0/H0;->f:LA/i;

    if-eqz v3, :cond_2

    const/4 v5, 0x0

    invoke-virtual {v3, v1, v5}, LA/i;->h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    if-eqz p1, :cond_3

    invoke-virtual {v1}, LW/c;->a()V

    :cond_3
    iget-object p1, v0, LW/p;->a:LW/c;

    iput-object v2, p1, LW/c;->a:Landroid/graphics/Canvas;

    invoke-direct {p0, v4}, Lo0/H0;->setInvalidated(Z)V

    return-void
.end method

.method public final e(J)V
    .locals 3

    const/16 v0, 0x20

    shr-long v0, p1, v0

    long-to-int v0, v0

    const-wide v1, 0xffffffffL

    and-long/2addr p1, v1

    long-to-int p1, p1

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result p2

    if-ne v0, p2, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result p2

    if-eq p1, p2, :cond_2

    :cond_0
    iget-wide v1, p0, Lo0/H0;->o:J

    invoke-static {v1, v2}, LW/K;->a(J)F

    move-result p2

    int-to-float v1, v0

    mul-float/2addr p2, v1

    invoke-virtual {p0, p2}, Landroid/view/View;->setPivotX(F)V

    iget-wide v1, p0, Lo0/H0;->o:J

    invoke-static {v1, v2}, LW/K;->b(J)F

    move-result p2

    int-to-float v1, p1

    mul-float/2addr p2, v1

    invoke-virtual {p0, p2}, Landroid/view/View;->setPivotY(F)V

    iget-object p2, p0, Lo0/H0;->h:Lo0/r0;

    invoke-virtual {p2}, Lo0/r0;->b()Landroid/graphics/Outline;

    move-result-object p2

    if-eqz p2, :cond_1

    sget-object p2, Lo0/H0;->s:LZ/p;

    goto :goto_0

    :cond_1
    const/4 p2, 0x0

    :goto_0
    invoke-virtual {p0, p2}, Landroid/view/View;->setOutlineProvider(Landroid/view/ViewOutlineProvider;)V

    invoke-virtual {p0}, Landroid/view/View;->getLeft()I

    move-result p2

    invoke-virtual {p0}, Landroid/view/View;->getTop()I

    move-result v1

    invoke-virtual {p0}, Landroid/view/View;->getLeft()I

    move-result v2

    add-int/2addr v2, v0

    invoke-virtual {p0}, Landroid/view/View;->getTop()I

    move-result v0

    add-int/2addr v0, p1

    invoke-virtual {p0, p2, v1, v2, v0}, Landroid/view/View;->layout(IIII)V

    invoke-virtual {p0}, Lo0/H0;->k()V

    iget-object p1, p0, Lo0/H0;->n:Lo0/o0;

    invoke-virtual {p1}, Lo0/o0;->c()V

    :cond_2
    return-void
.end method

.method public final f(LV/b;Z)V
    .locals 1

    iget-object v0, p0, Lo0/H0;->n:Lo0/o0;

    if-eqz p2, :cond_1

    invoke-virtual {v0, p0}, Lo0/o0;->a(Ljava/lang/Object;)[F

    move-result-object p2

    if-eqz p2, :cond_0

    invoke-static {p2, p1}, LW/D;->u([FLV/b;)V

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    iput p2, p1, LV/b;->a:F

    iput p2, p1, LV/b;->b:F

    iput p2, p1, LV/b;->c:F

    iput p2, p1, LV/b;->d:F

    goto :goto_0

    :cond_1
    invoke-virtual {v0, p0}, Lo0/o0;->b(Ljava/lang/Object;)[F

    move-result-object p2

    invoke-static {p2, p1}, LW/D;->u([FLV/b;)V

    :goto_0
    return-void
.end method

.method public final forceLayout()V
    .locals 0

    return-void
.end method

.method public final g(J)Z
    .locals 4

    invoke-static {p1, p2}, LV/c;->b(J)F

    move-result v0

    invoke-static {p1, p2}, LV/c;->c(J)F

    move-result v1

    iget-boolean v2, p0, Lo0/H0;->i:Z

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    const/4 p1, 0x0

    cmpg-float p2, p1, v0

    if-gtz p2, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result p2

    int-to-float p2, p2

    cmpg-float p2, v0, p2

    if-gez p2, :cond_0

    cmpg-float p1, p1, v1

    if-gtz p1, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result p1

    int-to-float p1, p1

    cmpg-float p1, v1, p1

    if-gez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    return v3

    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getClipToOutline()Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lo0/H0;->h:Lo0/r0;

    iget-boolean v1, v0, Lo0/r0;->m:Z

    if-nez v1, :cond_2

    goto :goto_1

    :cond_2
    iget-object v0, v0, Lo0/r0;->c:LW/B;

    if-nez v0, :cond_3

    goto :goto_1

    :cond_3
    invoke-static {p1, p2}, LV/c;->b(J)F

    move-result v1

    invoke-static {p1, p2}, LV/c;->c(J)F

    move-result p1

    const/4 p2, 0x0

    invoke-static {v0, v1, p1, p2, p2}, Lo0/K;->j(LW/B;FFLW/C;LW/C;)Z

    move-result v3

    :cond_4
    :goto_1
    return v3
.end method

.method public final getCameraDistancePx()F
    .locals 2

    invoke-virtual {p0}, Landroid/view/View;->getCameraDistance()F

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    iget v1, v1, Landroid/util/DisplayMetrics;->densityDpi:I

    int-to-float v1, v1

    div-float/2addr v0, v1

    return v0
.end method

.method public final getContainer()Lo0/k0;
    .locals 1

    iget-object v0, p0, Lo0/H0;->e:Lo0/k0;

    return-object v0
.end method

.method public getLayerId()J
    .locals 2

    iget-wide v0, p0, Lo0/H0;->q:J

    return-wide v0
.end method

.method public final getOwnerView()Lo0/u;
    .locals 1

    iget-object v0, p0, Lo0/H0;->d:Lo0/u;

    return-object v0
.end method

.method public getOwnerViewId()J
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_0

    iget-object v0, p0, Lo0/H0;->d:Lo0/u;

    invoke-static {v0}, Lo0/G0;->a(Landroid/view/View;)J

    move-result-wide v0

    goto :goto_0

    :cond_0
    const-wide/16 v0, -0x1

    :goto_0
    return-wide v0
.end method

.method public final h(LW/o;LZ/d;)V
    .locals 2

    invoke-virtual {p0}, Landroid/view/View;->getElevation()F

    move-result p2

    const/4 v0, 0x0

    cmpl-float p2, p2, v0

    if-lez p2, :cond_0

    const/4 p2, 0x1

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    iput-boolean p2, p0, Lo0/H0;->l:Z

    if-eqz p2, :cond_1

    invoke-interface {p1}, LW/o;->m()V

    :cond_1
    iget-object p2, p0, Lo0/H0;->e:Lo0/k0;

    invoke-virtual {p0}, Landroid/view/View;->getDrawingTime()J

    move-result-wide v0

    invoke-virtual {p2, p1, p0, v0, v1}, Lo0/k0;->a(LW/o;Lo0/H0;J)V

    iget-boolean p2, p0, Lo0/H0;->l:Z

    if-eqz p2, :cond_2

    invoke-interface {p1}, LW/o;->e()V

    :cond_2
    return-void
.end method

.method public final hasOverlappingRendering()Z
    .locals 1

    iget-boolean v0, p0, Lo0/H0;->p:Z

    return v0
.end method

.method public final i(LA/i;LA0/c;)V
    .locals 2

    iget-object v0, p0, Lo0/H0;->e:Lo0/k0;

    invoke-virtual {v0, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lo0/H0;->i:Z

    iput-boolean v0, p0, Lo0/H0;->l:Z

    sget-wide v0, LW/K;->a:J

    iput-wide v0, p0, Lo0/H0;->o:J

    iput-object p1, p0, Lo0/H0;->f:LA/i;

    iput-object p2, p0, Lo0/H0;->g:LA0/c;

    return-void
.end method

.method public final invalidate()V
    .locals 1

    iget-boolean v0, p0, Lo0/H0;->k:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lo0/H0;->setInvalidated(Z)V

    invoke-super {p0}, Landroid/view/View;->invalidate()V

    iget-object v0, p0, Lo0/H0;->d:Lo0/u;

    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    :cond_0
    return-void
.end method

.method public final j(LW/F;)V
    .locals 14

    iget v0, p1, LW/F;->d:I

    iget v1, p0, Lo0/H0;->r:I

    or-int/2addr v0, v1

    and-int/lit16 v1, v0, 0x1000

    if-eqz v1, :cond_0

    iget-wide v1, p1, LW/F;->q:J

    iput-wide v1, p0, Lo0/H0;->o:J

    invoke-static {v1, v2}, LW/K;->a(J)F

    move-result v1

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v2

    int-to-float v2, v2

    mul-float/2addr v1, v2

    invoke-virtual {p0, v1}, Landroid/view/View;->setPivotX(F)V

    iget-wide v1, p0, Lo0/H0;->o:J

    invoke-static {v1, v2}, LW/K;->b(J)F

    move-result v1

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v2

    int-to-float v2, v2

    mul-float/2addr v1, v2

    invoke-virtual {p0, v1}, Landroid/view/View;->setPivotY(F)V

    :cond_0
    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_1

    iget v1, p1, LW/F;->e:F

    invoke-virtual {p0, v1}, Landroid/view/View;->setScaleX(F)V

    :cond_1
    and-int/lit8 v1, v0, 0x2

    if-eqz v1, :cond_2

    iget v1, p1, LW/F;->f:F

    invoke-virtual {p0, v1}, Landroid/view/View;->setScaleY(F)V

    :cond_2
    and-int/lit8 v1, v0, 0x4

    if-eqz v1, :cond_3

    iget v1, p1, LW/F;->g:F

    invoke-virtual {p0, v1}, Landroid/view/View;->setAlpha(F)V

    :cond_3
    and-int/lit8 v1, v0, 0x8

    if-eqz v1, :cond_4

    iget v1, p1, LW/F;->h:F

    invoke-virtual {p0, v1}, Landroid/view/View;->setTranslationX(F)V

    :cond_4
    and-int/lit8 v1, v0, 0x10

    if-eqz v1, :cond_5

    iget v1, p1, LW/F;->i:F

    invoke-virtual {p0, v1}, Landroid/view/View;->setTranslationY(F)V

    :cond_5
    and-int/lit8 v1, v0, 0x20

    if-eqz v1, :cond_6

    iget v1, p1, LW/F;->j:F

    invoke-virtual {p0, v1}, Landroid/view/View;->setElevation(F)V

    :cond_6
    and-int/lit16 v1, v0, 0x400

    if-eqz v1, :cond_7

    iget v1, p1, LW/F;->o:F

    invoke-virtual {p0, v1}, Landroid/view/View;->setRotation(F)V

    :cond_7
    and-int/lit16 v1, v0, 0x100

    if-eqz v1, :cond_8

    iget v1, p1, LW/F;->m:F

    invoke-virtual {p0, v1}, Landroid/view/View;->setRotationX(F)V

    :cond_8
    and-int/lit16 v1, v0, 0x200

    if-eqz v1, :cond_9

    iget v1, p1, LW/F;->n:F

    invoke-virtual {p0, v1}, Landroid/view/View;->setRotationY(F)V

    :cond_9
    and-int/lit16 v1, v0, 0x800

    if-eqz v1, :cond_a

    iget v1, p1, LW/F;->p:F

    invoke-virtual {p0, v1}, Lo0/H0;->setCameraDistancePx(F)V

    :cond_a
    invoke-direct {p0}, Lo0/H0;->getManualClipPath()LW/C;

    move-result-object v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_b

    move v1, v2

    goto :goto_0

    :cond_b
    move v1, v3

    :goto_0
    iget-boolean v4, p1, LW/F;->s:Z

    sget-object v5, LW/D;->a:LX1/e;

    if-eqz v4, :cond_c

    iget-object v6, p1, LW/F;->r:LW/H;

    if-eq v6, v5, :cond_c

    move v10, v2

    goto :goto_1

    :cond_c
    move v10, v3

    :goto_1
    and-int/lit16 v6, v0, 0x6000

    if-eqz v6, :cond_e

    if-eqz v4, :cond_d

    iget-object v4, p1, LW/F;->r:LW/H;

    if-ne v4, v5, :cond_d

    move v4, v2

    goto :goto_2

    :cond_d
    move v4, v3

    :goto_2
    iput-boolean v4, p0, Lo0/H0;->i:Z

    invoke-virtual {p0}, Lo0/H0;->k()V

    invoke-virtual {p0, v10}, Landroid/view/View;->setClipToOutline(Z)V

    :cond_e
    iget-object v8, p1, LW/F;->x:LW/B;

    iget v9, p1, LW/F;->g:F

    iget v11, p1, LW/F;->j:F

    iget-wide v12, p1, LW/F;->u:J

    iget-object v7, p0, Lo0/H0;->h:Lo0/r0;

    invoke-virtual/range {v7 .. v13}, Lo0/r0;->c(LW/B;FZFJ)Z

    move-result v4

    iget-object v5, p0, Lo0/H0;->h:Lo0/r0;

    iget-boolean v6, v5, Lo0/r0;->f:Z

    const/4 v7, 0x0

    if-eqz v6, :cond_10

    invoke-virtual {v5}, Lo0/r0;->b()Landroid/graphics/Outline;

    move-result-object v5

    if-eqz v5, :cond_f

    sget-object v5, Lo0/H0;->s:LZ/p;

    goto :goto_3

    :cond_f
    move-object v5, v7

    :goto_3
    invoke-virtual {p0, v5}, Landroid/view/View;->setOutlineProvider(Landroid/view/ViewOutlineProvider;)V

    :cond_10
    invoke-direct {p0}, Lo0/H0;->getManualClipPath()LW/C;

    move-result-object v5

    if-eqz v5, :cond_11

    move v5, v2

    goto :goto_4

    :cond_11
    move v5, v3

    :goto_4
    if-ne v1, v5, :cond_12

    if-eqz v5, :cond_13

    if-eqz v4, :cond_13

    :cond_12
    invoke-virtual {p0}, Lo0/H0;->invalidate()V

    :cond_13
    iget-boolean v1, p0, Lo0/H0;->l:Z

    if-nez v1, :cond_14

    invoke-virtual {p0}, Landroid/view/View;->getElevation()F

    move-result v1

    const/4 v4, 0x0

    cmpl-float v1, v1, v4

    if-lez v1, :cond_14

    iget-object v1, p0, Lo0/H0;->g:LA0/c;

    if-eqz v1, :cond_14

    invoke-virtual {v1}, LA0/c;->c()Ljava/lang/Object;

    :cond_14
    and-int/lit16 v1, v0, 0x1f1b

    if-eqz v1, :cond_15

    iget-object v1, p0, Lo0/H0;->n:Lo0/o0;

    invoke-virtual {v1}, Lo0/o0;->c()V

    :cond_15
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x1c

    if-lt v1, v4, :cond_17

    and-int/lit8 v4, v0, 0x40

    sget-object v5, Lo0/J0;->a:Lo0/J0;

    if-eqz v4, :cond_16

    iget-wide v8, p1, LW/F;->k:J

    invoke-static {v8, v9}, LW/D;->C(J)I

    move-result v4

    invoke-virtual {v5, p0, v4}, Lo0/J0;->a(Landroid/view/View;I)V

    :cond_16
    and-int/lit16 v4, v0, 0x80

    if-eqz v4, :cond_17

    iget-wide v8, p1, LW/F;->l:J

    invoke-static {v8, v9}, LW/D;->C(J)I

    move-result v4

    invoke-virtual {v5, p0, v4}, Lo0/J0;->b(Landroid/view/View;I)V

    :cond_17
    const/16 v4, 0x1f

    if-lt v1, v4, :cond_18

    const/high16 v1, 0x20000

    and-int/2addr v1, v0

    if-eqz v1, :cond_18

    sget-object v1, Lo0/K0;->a:Lo0/K0;

    invoke-virtual {v1, p0, v7}, Lo0/K0;->a(Landroid/view/View;LW/E;)V

    :cond_18
    const v1, 0x8000

    and-int/2addr v0, v1

    if-eqz v0, :cond_1b

    iget v0, p1, LW/F;->t:I

    invoke-static {v0, v2}, LW/D;->m(II)Z

    move-result v1

    const/4 v4, 0x2

    if-eqz v1, :cond_19

    invoke-virtual {p0, v4, v7}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    goto :goto_5

    :cond_19
    invoke-static {v0, v4}, LW/D;->m(II)Z

    move-result v0

    if-eqz v0, :cond_1a

    invoke-virtual {p0, v3, v7}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    move v2, v3

    goto :goto_5

    :cond_1a
    invoke-virtual {p0, v3, v7}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    :goto_5
    iput-boolean v2, p0, Lo0/H0;->p:Z

    :cond_1b
    iget p1, p1, LW/F;->d:I

    iput p1, p0, Lo0/H0;->r:I

    return-void
.end method

.method public final k()V
    .locals 4

    iget-boolean v0, p0, Lo0/H0;->i:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lo0/H0;->j:Landroid/graphics/Rect;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    new-instance v0, Landroid/graphics/Rect;

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v2

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v3

    invoke-direct {v0, v1, v1, v2, v3}, Landroid/graphics/Rect;-><init>(IIII)V

    iput-object v0, p0, Lo0/H0;->j:Landroid/graphics/Rect;

    goto :goto_0

    :cond_0
    invoke-static {v0}, Lp2/g;->b(Ljava/lang/Object;)V

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v2

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v3

    invoke-virtual {v0, v1, v1, v2, v3}, Landroid/graphics/Rect;->set(IIII)V

    :goto_0
    iget-object v0, p0, Lo0/H0;->j:Landroid/graphics/Rect;

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    invoke-virtual {p0, v0}, Landroid/view/View;->setClipBounds(Landroid/graphics/Rect;)V

    return-void
.end method

.method public final onLayout(ZIIII)V
    .locals 0

    return-void
.end method

.method public final setCameraDistancePx(F)V
    .locals 1

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->densityDpi:I

    int-to-float v0, v0

    mul-float/2addr p1, v0

    invoke-virtual {p0, p1}, Landroid/view/View;->setCameraDistance(F)V

    return-void
.end method
