.class final Landroidx/compose/foundation/layout/PaddingElement;
.super Ln0/P;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ln0/P;"
    }
.end annotation


# instance fields
.field public final a:F

.field public final b:F

.field public final c:F

.field public final d:F


# direct methods
.method public constructor <init>(FFFF)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Landroidx/compose/foundation/layout/PaddingElement;->a:F

    iput p2, p0, Landroidx/compose/foundation/layout/PaddingElement;->b:F

    iput p3, p0, Landroidx/compose/foundation/layout/PaddingElement;->c:F

    iput p4, p0, Landroidx/compose/foundation/layout/PaddingElement;->d:F

    const/4 v0, 0x0

    cmpl-float v1, p1, v0

    const/high16 v2, 0x7fc00000    # Float.NaN

    if-gez v1, :cond_0

    invoke-static {p1, v2}, LG0/e;->a(FF)Z

    move-result p1

    if-eqz p1, :cond_3

    :cond_0
    cmpl-float p1, p2, v0

    if-gez p1, :cond_1

    invoke-static {p2, v2}, LG0/e;->a(FF)Z

    move-result p1

    if-eqz p1, :cond_3

    :cond_1
    cmpl-float p1, p3, v0

    if-gez p1, :cond_2

    invoke-static {p3, v2}, LG0/e;->a(FF)Z

    move-result p1

    if-eqz p1, :cond_3

    :cond_2
    cmpl-float p1, p4, v0

    if-gez p1, :cond_4

    invoke-static {p4, v2}, LG0/e;->a(FF)Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_0

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Padding must be non-negative"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    :goto_0
    return-void
.end method


# virtual methods
.method public final d()LP/k;
    .locals 2

    new-instance v0, Lt/o;

    invoke-direct {v0}, LP/k;-><init>()V

    iget v1, p0, Landroidx/compose/foundation/layout/PaddingElement;->a:F

    iput v1, v0, Lt/o;->q:F

    iget v1, p0, Landroidx/compose/foundation/layout/PaddingElement;->b:F

    iput v1, v0, Lt/o;->r:F

    iget v1, p0, Landroidx/compose/foundation/layout/PaddingElement;->c:F

    iput v1, v0, Lt/o;->s:F

    iget v1, p0, Landroidx/compose/foundation/layout/PaddingElement;->d:F

    iput v1, v0, Lt/o;->t:F

    const/4 v1, 0x1

    iput-boolean v1, v0, Lt/o;->u:Z

    return-object v0
.end method

.method public final e(LP/k;)V
    .locals 1

    check-cast p1, Lt/o;

    iget v0, p0, Landroidx/compose/foundation/layout/PaddingElement;->a:F

    iput v0, p1, Lt/o;->q:F

    iget v0, p0, Landroidx/compose/foundation/layout/PaddingElement;->b:F

    iput v0, p1, Lt/o;->r:F

    iget v0, p0, Landroidx/compose/foundation/layout/PaddingElement;->c:F

    iput v0, p1, Lt/o;->s:F

    iget v0, p0, Landroidx/compose/foundation/layout/PaddingElement;->d:F

    iput v0, p1, Lt/o;->t:F

    const/4 v0, 0x1

    iput-boolean v0, p1, Lt/o;->u:Z

    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Landroidx/compose/foundation/layout/PaddingElement;

    if-eqz v0, :cond_0

    check-cast p1, Landroidx/compose/foundation/layout/PaddingElement;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    const/4 v0, 0x0

    if-nez p1, :cond_1

    return v0

    :cond_1
    iget v1, p0, Landroidx/compose/foundation/layout/PaddingElement;->a:F

    iget v2, p1, Landroidx/compose/foundation/layout/PaddingElement;->a:F

    invoke-static {v1, v2}, LG0/e;->a(FF)Z

    move-result v1

    if-eqz v1, :cond_2

    iget v1, p0, Landroidx/compose/foundation/layout/PaddingElement;->b:F

    iget v2, p1, Landroidx/compose/foundation/layout/PaddingElement;->b:F

    invoke-static {v1, v2}, LG0/e;->a(FF)Z

    move-result v1

    if-eqz v1, :cond_2

    iget v1, p0, Landroidx/compose/foundation/layout/PaddingElement;->c:F

    iget v2, p1, Landroidx/compose/foundation/layout/PaddingElement;->c:F

    invoke-static {v1, v2}, LG0/e;->a(FF)Z

    move-result v1

    if-eqz v1, :cond_2

    iget v1, p0, Landroidx/compose/foundation/layout/PaddingElement;->d:F

    iget p1, p1, Landroidx/compose/foundation/layout/PaddingElement;->d:F

    invoke-static {v1, p1}, LG0/e;->a(FF)Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 v0, 0x1

    :cond_2
    return v0
.end method

.method public final hashCode()I
    .locals 3

    iget v0, p0, Landroidx/compose/foundation/layout/PaddingElement;->a:F

    invoke-static {v0}, Ljava/lang/Float;->hashCode(F)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Landroidx/compose/foundation/layout/PaddingElement;->b:F

    invoke-static {v2, v0, v1}, Lp/f;->a(FII)I

    move-result v0

    iget v2, p0, Landroidx/compose/foundation/layout/PaddingElement;->c:F

    invoke-static {v2, v0, v1}, Lp/f;->a(FII)I

    move-result v0

    iget v2, p0, Landroidx/compose/foundation/layout/PaddingElement;->d:F

    invoke-static {v2, v0, v1}, Lp/f;->a(FII)I

    move-result v0

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method
