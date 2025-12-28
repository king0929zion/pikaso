.class public LD2/t;
.super Ly2/a;
.source "SourceFile"

# interfaces
.implements Li2/d;


# instance fields
.field public final g:Lg2/d;


# direct methods
.method public constructor <init>(Lg2/d;Lg2/i;)V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, p2, v0}, Ly2/a;-><init>(Lg2/i;Z)V

    iput-object p1, p0, LD2/t;->g:Lg2/d;

    return-void
.end method


# virtual methods
.method public final Q()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final j()Li2/d;
    .locals 2

    iget-object v0, p0, LD2/t;->g:Lg2/d;

    instance-of v1, v0, Li2/d;

    if-eqz v1, :cond_0

    check-cast v0, Li2/d;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public y(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, LD2/t;->g:Lg2/d;

    invoke-static {v0}, LZ/b;->z(Lg2/d;)Lg2/d;

    move-result-object v0

    invoke-static {p1}, Ly2/v;->m(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {v0, p1}, LD2/a;->i(Lg2/d;Ljava/lang/Object;)V

    return-void
.end method

.method public z(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, LD2/t;->g:Lg2/d;

    invoke-static {p1}, Ly2/v;->m(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v0, p1}, Lg2/d;->t(Ljava/lang/Object;)V

    return-void
.end method
