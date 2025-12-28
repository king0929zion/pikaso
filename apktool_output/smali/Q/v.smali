.class public final Lq/v;
.super LP/k;
.source "SourceFile"

# interfaces
.implements Ln0/g;
.implements Ln0/a0;


# virtual methods
.method public final Q()V
    .locals 3

    new-instance v0, Lp2/o;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    new-instance v1, LD/q0;

    const/4 v2, 0x6

    invoke-direct {v1, v0, v2, p0}, LD/q0;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    invoke-static {p0, v1}, Ln0/C;->o(LP/k;Lo2/a;)V

    iget-object v0, v0, Lp2/o;->d:Ljava/lang/Object;

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/ClassCastException;

    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    throw v0
.end method

.method public final V()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
