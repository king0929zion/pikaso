.class public final LU0/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo0/a0;


# instance fields
.field public final a:[F

.field public final b:[I


# direct methods
.method public constructor <init>(II)V
    .locals 0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    filled-new-array {p1, p2}, [I

    move-result-object p1

    iput-object p1, p0, LU0/i;->b:[I

    const/4 p1, 0x2

    .line 9
    new-array p1, p1, [F

    fill-array-data p1, :array_0

    iput-object p1, p0, LU0/i;->a:[F

    return-void

    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public constructor <init>(III)V
    .locals 0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    filled-new-array {p1, p2, p3}, [I

    move-result-object p1

    iput-object p1, p0, LU0/i;->b:[I

    const/4 p1, 0x3

    .line 12
    new-array p1, p1, [F

    fill-array-data p1, :array_0

    iput-object p1, p0, LU0/i;->a:[F

    return-void

    :array_0
    .array-data 4
        0x0
        0x3f000000    # 0.5f
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public constructor <init>(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    .line 3
    new-array v1, v0, [I

    iput-object v1, p0, LU0/i;->b:[I

    .line 4
    new-array v1, v0, [F

    iput-object v1, p0, LU0/i;->a:[F

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    .line 5
    iget-object v2, p0, LU0/i;->b:[I

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    aput v3, v2, v1

    .line 6
    iget-object v2, p0, LU0/i;->a:[F

    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Float;

    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    move-result v3

    aput v3, v2, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public constructor <init>([F)V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LU0/i;->a:[F

    const/4 p1, 0x2

    .line 14
    new-array p1, p1, [I

    iput-object p1, p0, LU0/i;->b:[I

    return-void
.end method


# virtual methods
.method public a(Landroid/view/View;[F)V
    .locals 0

    invoke-static {p2}, LW/D;->v([F)V

    invoke-virtual {p0, p1, p2}, LU0/i;->b(Landroid/view/View;[F)V

    return-void
.end method

.method public b(Landroid/view/View;[F)V
    .locals 4

    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    instance-of v1, v0, Landroid/view/View;

    iget-object v2, p0, LU0/i;->a:[F

    if-eqz v1, :cond_0

    check-cast v0, Landroid/view/View;

    invoke-virtual {p0, v0, p2}, LU0/i;->b(Landroid/view/View;[F)V

    invoke-virtual {p1}, Landroid/view/View;->getScrollX()I

    move-result v0

    int-to-float v0, v0

    neg-float v0, v0

    invoke-virtual {p1}, Landroid/view/View;->getScrollY()I

    move-result v1

    int-to-float v1, v1

    neg-float v1, v1

    invoke-static {v2}, LW/D;->v([F)V

    invoke-static {v2, v0, v1}, LW/D;->F([FFF)V

    invoke-static {p2, v2}, Lo0/K;->m([F[F)V

    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result v1

    int-to-float v1, v1

    invoke-static {v2}, LW/D;->v([F)V

    invoke-static {v2, v0, v1}, LW/D;->F([FFF)V

    invoke-static {p2, v2}, Lo0/K;->m([F[F)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, LU0/i;->b:[I

    invoke-virtual {p1, v0}, Landroid/view/View;->getLocationInWindow([I)V

    invoke-virtual {p1}, Landroid/view/View;->getScrollX()I

    move-result v1

    int-to-float v1, v1

    neg-float v1, v1

    invoke-virtual {p1}, Landroid/view/View;->getScrollY()I

    move-result v3

    int-to-float v3, v3

    neg-float v3, v3

    invoke-static {v2}, LW/D;->v([F)V

    invoke-static {v2, v1, v3}, LW/D;->F([FFF)V

    invoke-static {p2, v2}, Lo0/K;->m([F[F)V

    const/4 v1, 0x0

    aget v1, v0, v1

    int-to-float v1, v1

    const/4 v3, 0x1

    aget v0, v0, v3

    int-to-float v0, v0

    invoke-static {v2}, LW/D;->v([F)V

    invoke-static {v2, v1, v0}, LW/D;->F([FFF)V

    invoke-static {p2, v2}, Lo0/K;->m([F[F)V

    :goto_0
    invoke-virtual {p1}, Landroid/view/View;->getMatrix()Landroid/graphics/Matrix;

    move-result-object p1

    invoke-virtual {p1}, Landroid/graphics/Matrix;->isIdentity()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {v2, p1}, LW/D;->y([FLandroid/graphics/Matrix;)V

    invoke-static {p2, v2}, Lo0/K;->m([F[F)V

    :cond_1
    return-void
.end method
