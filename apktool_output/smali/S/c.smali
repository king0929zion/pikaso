.class public final LS/c;
.super Lp2/h;
.source "SourceFile"

# interfaces
.implements Lo2/c;


# virtual methods
.method public final i(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, LS/d;

    iget-object v0, p1, LP/k;->d:LP/k;

    iget-boolean v0, v0, LP/k;->p:Z

    if-nez v0, :cond_0

    sget-object p1, Ln0/n0;->e:Ln0/n0;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p1, LS/d;->q:LS/d;

    sget-object p1, Ln0/n0;->d:Ln0/n0;

    :goto_0
    return-object p1
.end method
