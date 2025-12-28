.class public final Lq/q;
.super LP/k;
.source "SourceFile"

# interfaces
.implements Ln0/g;
.implements LU/l;


# virtual methods
.method public final h(LU/i;)V
    .locals 2

    sget-object v0, Lo0/f0;->k:LD/M0;

    invoke-static {p0, v0}, Ln0/C;->h(Ln0/g;LD/k0;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lf0/b;

    check-cast v0, Lf0/c;

    iget-object v0, v0, Lf0/c;->a:LD/f0;

    invoke-virtual {v0}, LD/f0;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lf0/a;

    iget v0, v0, Lf0/a;->a:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    xor-int/2addr v0, v1

    invoke-interface {p1, v0}, LU/i;->b(Z)V

    return-void
.end method
