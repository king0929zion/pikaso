.class public final Lz/t;
.super Landroid/view/View;
.source "SourceFile"


# static fields
.field public static final i:[I

.field public static final j:[I


# instance fields
.field public d:Lz/E;

.field public e:Ljava/lang/Boolean;

.field public f:Ljava/lang/Long;

.field public g:LR/a;

.field public h:Lp2/h;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const v0, 0x10100a7

    const v1, 0x101009e

    filled-new-array {v0, v1}, [I

    move-result-object v0

    sput-object v0, Lz/t;->i:[I

    const/4 v0, 0x0

    new-array v0, v0, [I

    sput-object v0, Lz/t;->j:[I

    return-void
.end method

.method public static synthetic a(Lz/t;)V
    .locals 0

    invoke-static {p0}, Lz/t;->setRippleState$lambda$2(Lz/t;)V

    return-void
.end method

.method private final setRippleState(Z)V
    .locals 6

    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    move-result-wide v0

    iget-object v2, p0, Lz/t;->g:LR/a;

    if-eqz v2, :cond_0

    invoke-virtual {p0, v2}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    invoke-virtual {v2}, LR/a;->run()V

    :cond_0
    iget-object v2, p0, Lz/t;->f:Ljava/lang/Long;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    goto :goto_0

    :cond_1
    const-wide/16 v2, 0x0

    :goto_0
    sub-long v2, v0, v2

    if-nez p1, :cond_2

    const-wide/16 v4, 0x5

    cmp-long v2, v2, v4

    if-gez v2, :cond_2

    new-instance p1, LR/a;

    const/16 v2, 0xd

    invoke-direct {p1, v2, p0}, LR/a;-><init>(ILjava/lang/Object;)V

    iput-object p1, p0, Lz/t;->g:LR/a;

    const-wide/16 v2, 0x32

    invoke-virtual {p0, p1, v2, v3}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_2

    :cond_2
    if-eqz p1, :cond_3

    sget-object p1, Lz/t;->i:[I

    goto :goto_1

    :cond_3
    sget-object p1, Lz/t;->j:[I

    :goto_1
    iget-object v2, p0, Lz/t;->d:Lz/E;

    if-nez v2, :cond_4

    goto :goto_2

    :cond_4
    invoke-virtual {v2, p1}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    :goto_2
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, Lz/t;->f:Ljava/lang/Long;

    return-void
.end method

.method private static final setRippleState$lambda$2(Lz/t;)V
    .locals 2

    iget-object v0, p0, Lz/t;->d:Lz/E;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    sget-object v1, Lz/t;->j:[I

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    :goto_0
    const/4 v0, 0x0

    iput-object v0, p0, Lz/t;->g:LR/a;

    return-void
.end method


# virtual methods
.method public final b(Ls/i;ZJIJFLo2/a;)V
    .locals 10

    move-object v6, p0

    move-object v7, p1

    move v8, p2

    move v0, p5

    iget-object v1, v6, Lz/t;->d:Lz/E;

    if-eqz v1, :cond_0

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    iget-object v2, v6, Lz/t;->e:Ljava/lang/Boolean;

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    :cond_0
    new-instance v1, Lz/E;

    invoke-direct {v1, p2}, Lz/E;-><init>(Z)V

    invoke-virtual {p0, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    iput-object v1, v6, Lz/t;->d:Lz/E;

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    iput-object v1, v6, Lz/t;->e:Ljava/lang/Boolean;

    :cond_1
    iget-object v9, v6, Lz/t;->d:Lz/E;

    invoke-static {v9}, Lp2/g;->b(Ljava/lang/Object;)V

    move-object/from16 v1, p9

    check-cast v1, Lp2/h;

    iput-object v1, v6, Lz/t;->h:Lp2/h;

    iget-object v1, v9, Lz/E;->f:Ljava/lang/Integer;

    if-nez v1, :cond_2

    goto :goto_0

    :cond_2
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-eq v1, v0, :cond_3

    :goto_0
    invoke-static {p5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v9, Lz/E;->f:Ljava/lang/Integer;

    sget-object v1, Lz/D;->a:Lz/D;

    invoke-virtual {v1, v9, p5}, Lz/D;->a(Landroid/graphics/drawable/RippleDrawable;I)V

    :cond_3
    move-object v0, p0

    move-wide v1, p3

    move-wide/from16 v3, p6

    move/from16 v5, p8

    invoke-virtual/range {v0 .. v5}, Lz/t;->e(JJF)V

    if-eqz v8, :cond_4

    iget-wide v0, v7, Ls/i;->a:J

    invoke-static {v0, v1}, LV/c;->b(J)F

    move-result v0

    iget-wide v1, v7, Ls/i;->a:J

    invoke-static {v1, v2}, LV/c;->c(J)F

    move-result v1

    invoke-virtual {v9, v0, v1}, Landroid/graphics/drawable/Drawable;->setHotspot(FF)V

    goto :goto_1

    :cond_4
    invoke-virtual {v9}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/Rect;->centerX()I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {v9}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v1

    invoke-virtual {v1}, Landroid/graphics/Rect;->centerY()I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {v9, v0, v1}, Landroid/graphics/drawable/Drawable;->setHotspot(FF)V

    :goto_1
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lz/t;->setRippleState(Z)V

    return-void
.end method

.method public final c()V
    .locals 2

    const/4 v0, 0x0

    iput-object v0, p0, Lz/t;->h:Lp2/h;

    iget-object v0, p0, Lz/t;->g:LR/a;

    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    iget-object v0, p0, Lz/t;->g:LR/a;

    invoke-static {v0}, Lp2/g;->b(Ljava/lang/Object;)V

    invoke-virtual {v0}, LR/a;->run()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lz/t;->d:Lz/E;

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    sget-object v1, Lz/t;->j:[I

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    :goto_0
    iget-object v0, p0, Lz/t;->d:Lz/E;

    if-nez v0, :cond_2

    return-void

    :cond_2
    const/4 v1, 0x0

    invoke-virtual {v0, v1, v1}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    invoke-virtual {p0, v0}, Landroid/view/View;->unscheduleDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public final d()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lz/t;->setRippleState(Z)V

    return-void
.end method

.method public final e(JJF)V
    .locals 4

    iget-object v0, p0, Lz/t;->d:Lz/E;

    if-nez v0, :cond_0

    return-void

    :cond_0
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1c

    if-ge v1, v2, :cond_1

    const/4 v1, 0x2

    int-to-float v1, v1

    mul-float/2addr p5, v1

    :cond_1
    const/high16 v1, 0x3f800000    # 1.0f

    cmpl-float v2, p5, v1

    if-lez v2, :cond_2

    move p5, v1

    :cond_2
    invoke-static {p3, p4, p5}, LW/r;->b(JF)J

    move-result-wide p3

    iget-object p5, v0, Lz/E;->e:LW/r;

    const/4 v1, 0x0

    if-nez p5, :cond_3

    move p5, v1

    goto :goto_0

    :cond_3
    iget-wide v2, p5, LW/r;->a:J

    invoke-static {v2, v3, p3, p4}, LW/r;->c(JJ)Z

    move-result p5

    :goto_0
    if-nez p5, :cond_4

    new-instance p5, LW/r;

    invoke-direct {p5, p3, p4}, LW/r;-><init>(J)V

    iput-object p5, v0, Lz/E;->e:LW/r;

    invoke-static {p3, p4}, LW/D;->C(J)I

    move-result p3

    invoke-static {p3}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object p3

    invoke-virtual {v0, p3}, Landroid/graphics/drawable/RippleDrawable;->setColor(Landroid/content/res/ColorStateList;)V

    :cond_4
    new-instance p3, Landroid/graphics/Rect;

    invoke-static {p1, p2}, LV/f;->d(J)F

    move-result p4

    invoke-static {p4}, Lr2/a;->U(F)I

    move-result p4

    invoke-static {p1, p2}, LV/f;->b(J)F

    move-result p1

    invoke-static {p1}, Lr2/a;->U(F)I

    move-result p1

    invoke-direct {p3, v1, v1, p4, p1}, Landroid/graphics/Rect;-><init>(IIII)V

    iget p1, p3, Landroid/graphics/Rect;->left:I

    invoke-virtual {p0, p1}, Landroid/view/View;->setLeft(I)V

    iget p1, p3, Landroid/graphics/Rect;->top:I

    invoke-virtual {p0, p1}, Landroid/view/View;->setTop(I)V

    iget p1, p3, Landroid/graphics/Rect;->right:I

    invoke-virtual {p0, p1}, Landroid/view/View;->setRight(I)V

    iget p1, p3, Landroid/graphics/Rect;->bottom:I

    invoke-virtual {p0, p1}, Landroid/view/View;->setBottom(I)V

    invoke-virtual {v0, p3}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    return-void
.end method

.method public final invalidateDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    iget-object p1, p0, Lz/t;->h:Lp2/h;

    if-eqz p1, :cond_0

    invoke-interface {p1}, Lo2/a;->c()Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public final onLayout(ZIIII)V
    .locals 0

    return-void
.end method

.method public final onMeasure(II)V
    .locals 0

    const/4 p1, 0x0

    invoke-virtual {p0, p1, p1}, Landroid/view/View;->setMeasuredDimension(II)V

    return-void
.end method

.method public final refreshDrawableState()V
    .locals 0

    return-void
.end method
