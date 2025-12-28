.class public LD1/y;
.super La/a;
.source "SourceFile"


# static fields
.field public static g:Z = true

.field public static h:Z = true

.field public static i:Z = true

.field public static j:Z = true


# virtual methods
.method public f0(Landroid/view/View;I)V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-ne v0, v1, :cond_0

    invoke-super {p0, p1, p2}, La/a;->f0(Landroid/view/View;I)V

    goto :goto_0

    :cond_0
    sget-boolean v0, LD1/y;->j:Z

    if-eqz v0, :cond_1

    :try_start_0
    invoke-static {p1, p2}, LC1/a;->f(Landroid/view/View;I)V
    :try_end_0
    .catch Ljava/lang/NoSuchMethodError; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 p1, 0x0

    sput-boolean p1, LD1/y;->j:Z

    :cond_1
    :goto_0
    return-void
.end method

.method public k0(Landroid/view/View;IIII)V
    .locals 1

    sget-boolean v0, LD1/y;->i:Z

    if-eqz v0, :cond_0

    :try_start_0
    invoke-static {p1, p2, p3, p4, p5}, LC1/a;->g(Landroid/view/View;IIII)V
    :try_end_0
    .catch Ljava/lang/NoSuchMethodError; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 p1, 0x0

    sput-boolean p1, LD1/y;->i:Z

    :cond_0
    :goto_0
    return-void
.end method

.method public l0(Landroid/view/View;Landroid/graphics/Matrix;)V
    .locals 1

    sget-boolean v0, LD1/y;->g:Z

    if-eqz v0, :cond_0

    :try_start_0
    invoke-static {p1, p2}, Ld1/a0;->m(Landroid/view/View;Landroid/graphics/Matrix;)V
    :try_end_0
    .catch Ljava/lang/NoSuchMethodError; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 p1, 0x0

    sput-boolean p1, LD1/y;->g:Z

    :cond_0
    :goto_0
    return-void
.end method

.method public m0(Landroid/view/View;Landroid/graphics/Matrix;)V
    .locals 1

    sget-boolean v0, LD1/y;->h:Z

    if-eqz v0, :cond_0

    :try_start_0
    invoke-static {p1, p2}, LC1/a;->h(Landroid/view/View;Landroid/graphics/Matrix;)V
    :try_end_0
    .catch Ljava/lang/NoSuchMethodError; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 p1, 0x0

    sput-boolean p1, LD1/y;->h:Z

    :cond_0
    :goto_0
    return-void
.end method
