.class final Landroidx/compose/foundation/layout/SizeElement;
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
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Landroidx/compose/foundation/layout/SizeElement;->a:F

    iput p2, p0, Landroidx/compose/foundation/layout/SizeElement;->b:F

    iput p3, p0, Landroidx/compose/foundation/layout/SizeElement;->c:F

    iput p4, p0, Landroidx/compose/foundation/layout/SizeElement;->d:F

    return-void
.end method


# virtual methods
.method public final d()LP/k;
    .locals 2

    new-instance v0, Lt/v;

    invoke-direct {v0}, LP/k;-><init>()V

    iget v1, p0, Landroidx/compose/foundation/layout/SizeElement;->a:F

    iput v1, v0, Lt/v;->q:F

    iget v1, p0, Landroidx/compose/foundation/layout/SizeElement;->b:F

    iput v1, v0, Lt/v;->r:F

    iget v1, p0, Landroidx/compose/foundation/layout/SizeElement;->c:F

    iput v1, v0, Lt/v;->s:F

    iget v1, p0, Landroidx/compose/foundation/layout/SizeElement;->d:F

    iput v1, v0, Lt/v;->t:F

    const/4 v1, 0x1

    iput-boolean v1, v0, Lt/v;->u:Z

    return-object v0
.end method

.method public final e(LP/k;)V
    .locals 1

    check-cast p1, Lt/v;

    iget v0, p0, Landroidx/compose/foundation/layout/SizeElement;->a:F

    iput v0, p1, Lt/v;->q:F

    iget v0, p0, Landroidx/compose/foundation/layout/SizeElement;->b:F

    iput v0, p1, Lt/v;->r:F

    iget v0, p0, Landroidx/compose/foundation/layout/SizeElement;->c:F

    iput v0, p1, Lt/v;->s:F

    iget v0, p0, Landroidx/compose/foundation/layout/SizeElement;->d:F

    iput v0, p1, Lt/v;->t:F

    const/4 v0, 0x1

    iput-boolean v0, p1, Lt/v;->u:Z

    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Landroidx/compose/foundation/layout/SizeElement;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Landroidx/compose/foundation/layout/SizeElement;

    iget v1, p1, Landroidx/compose/foundation/layout/SizeElement;->a:F

    iget v3, p0, Landroidx/compose/foundation/layout/SizeElement;->a:F

    invoke-static {v3, v1}, LG0/e;->a(FF)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Landroidx/compose/foundation/layout/SizeElement;->b:F

    iget v3, p1, Landroidx/compose/foundation/layout/SizeElement;->b:F

    invoke-static {v1, v3}, LG0/e;->a(FF)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, Landroidx/compose/foundation/layout/SizeElement;->c:F

    iget v3, p1, Landroidx/compose/foundation/layout/SizeElement;->c:F

    invoke-static {v1, v3}, LG0/e;->a(FF)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget v1, p0, Landroidx/compose/foundation/layout/SizeElement;->d:F

    iget p1, p1, Landroidx/compose/foundation/layout/SizeElement;->d:F

    invoke-static {v1, p1}, LG0/e;->a(FF)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final hashCode()I
    .locals 3

    iget v0, p0, Landroidx/compose/foundation/layout/SizeElement;->a:F

    invoke-static {v0}, Ljava/lang/Float;->hashCode(F)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Landroidx/compose/foundation/layout/SizeElement;->b:F

    invoke-static {v2, v0, v1}, Lp/f;->a(FII)I

    move-result v0

    iget v2, p0, Landroidx/compose/foundation/layout/SizeElement;->c:F

    invoke-static {v2, v0, v1}, Lp/f;->a(FII)I

    move-result v0

    iget v2, p0, Landroidx/compose/foundation/layout/SizeElement;->d:F

    invoke-static {v2, v0, v1}, Lp/f;->a(FII)I

    move-result v0

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method
