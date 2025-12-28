.class public final LD/M0;
.super LD/k0;
.source "SourceFile"


# virtual methods
.method public final a(Ljava/lang/Object;)LD/l0;
    .locals 7

    new-instance v6, LD/l0;

    if-nez p1, :cond_0

    const/4 v0, 0x1

    :goto_0
    move v3, v0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :goto_1
    const/4 v5, 0x0

    const/4 v4, 0x0

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    invoke-direct/range {v0 .. v5}, LD/l0;-><init>(LD/k0;Ljava/lang/Object;ZLD/H0;Z)V

    return-object v6
.end method
