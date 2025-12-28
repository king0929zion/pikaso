.class final Landroidx/compose/foundation/layout/BoxChildDataElement;
.super Ln0/P;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ln0/P;"
    }
.end annotation


# virtual methods
.method public final d()LP/k;
    .locals 2

    new-instance v0, Lt/d;

    invoke-direct {v0}, LP/k;-><init>()V

    sget-object v1, LP/a;->h:LP/d;

    iput-object v1, v0, Lt/d;->q:LP/d;

    return-object v0
.end method

.method public final e(LP/k;)V
    .locals 1

    check-cast p1, Lt/d;

    sget-object v0, LP/a;->h:LP/d;

    iput-object v0, p1, Lt/d;->q:LP/d;

    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v0, p1, Landroidx/compose/foundation/layout/BoxChildDataElement;

    if-eqz v0, :cond_1

    check-cast p1, Landroidx/compose/foundation/layout/BoxChildDataElement;

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    const/4 v0, 0x0

    if-nez p1, :cond_2

    return v0

    :cond_2
    sget-object p1, LP/a;->h:LP/d;

    invoke-virtual {p1, p1}, LP/d;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final hashCode()I
    .locals 3

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    const/16 v2, 0x1f

    mul-int/2addr v1, v2

    invoke-static {v0, v1, v2}, Lp/f;->a(FII)I

    move-result v0

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method
