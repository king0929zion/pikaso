.class final Landroidx/compose/foundation/layout/FillElement;
.super Ln0/P;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ln0/P;"
    }
.end annotation


# instance fields
.field public final a:I

.field public final b:F


# direct methods
.method public constructor <init>(IF)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Landroidx/compose/foundation/layout/FillElement;->a:I

    iput p2, p0, Landroidx/compose/foundation/layout/FillElement;->b:F

    return-void
.end method


# virtual methods
.method public final d()LP/k;
    .locals 2

    new-instance v0, Lt/n;

    invoke-direct {v0}, LP/k;-><init>()V

    iget v1, p0, Landroidx/compose/foundation/layout/FillElement;->a:I

    iput v1, v0, Lt/n;->q:I

    iget v1, p0, Landroidx/compose/foundation/layout/FillElement;->b:F

    iput v1, v0, Lt/n;->r:F

    return-object v0
.end method

.method public final e(LP/k;)V
    .locals 1

    check-cast p1, Lt/n;

    iget v0, p0, Landroidx/compose/foundation/layout/FillElement;->a:I

    iput v0, p1, Lt/n;->q:I

    iget v0, p0, Landroidx/compose/foundation/layout/FillElement;->b:F

    iput v0, p1, Lt/n;->r:F

    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Landroidx/compose/foundation/layout/FillElement;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Landroidx/compose/foundation/layout/FillElement;

    iget v1, p1, Landroidx/compose/foundation/layout/FillElement;->a:I

    iget v3, p0, Landroidx/compose/foundation/layout/FillElement;->a:I

    if-eq v3, v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Landroidx/compose/foundation/layout/FillElement;->b:F

    iget p1, p1, Landroidx/compose/foundation/layout/FillElement;->b:F

    cmpg-float p1, v1, p1

    if-nez p1, :cond_3

    return v0

    :cond_3
    return v2
.end method

.method public final hashCode()I
    .locals 2

    iget v0, p0, Landroidx/compose/foundation/layout/FillElement;->a:I

    invoke-static {v0}, Lp/f;->b(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Landroidx/compose/foundation/layout/FillElement;->b:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method
