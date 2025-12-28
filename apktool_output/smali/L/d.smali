.class public final LL/d;
.super Ljava/util/AbstractMap;
.source "SourceFile"

# interfaces
.implements Ljava/util/Map;
.implements Lq2/d;


# instance fields
.field public d:LK/b;

.field public e:LI/n;

.field public f:Ljava/lang/Object;

.field public g:I

.field public h:I

.field public i:LL/e;


# direct methods
.method public constructor <init>(LL/e;)V
    .locals 1

    invoke-direct {p0}, Ljava/util/AbstractMap;-><init>()V

    new-instance v0, LK/b;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, LL/d;->d:LK/b;

    iget-object v0, p1, LI/c;->d:LI/n;

    iput-object v0, p0, LL/d;->e:LI/n;

    iget v0, p1, LI/c;->e:I

    iput v0, p0, LL/d;->h:I

    iput-object p1, p0, LL/d;->i:LL/e;

    return-void
.end method


# virtual methods
.method public final a()LL/e;
    .locals 3

    iget-object v0, p0, LL/d;->e:LI/n;

    iget-object v1, p0, LL/d;->i:LL/e;

    iget-object v2, v1, LI/c;->d:LI/n;

    if-ne v0, v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, LK/b;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, LL/d;->d:LK/b;

    new-instance v1, LL/e;

    iget-object v0, p0, LL/d;->e:LI/n;

    iget v2, p0, LL/d;->h:I

    invoke-direct {v1, v0, v2}, LI/c;-><init>(LI/n;I)V

    :goto_0
    iput-object v1, p0, LL/d;->i:LL/e;

    return-object v1
.end method

.method public final b(Ljava/lang/Object;)Z
    .locals 3

    iget-object v0, p0, LL/d;->e:LI/n;

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    goto :goto_0

    :cond_0
    move v2, v1

    :goto_0
    invoke-virtual {v0, v2, v1, p1}, LI/n;->d(IILjava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final c(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, LL/d;->e:LI/n;

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    goto :goto_0

    :cond_0
    move v2, v1

    :goto_0
    invoke-virtual {v0, v2, v1, p1}, LI/n;->g(IILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final clear()V
    .locals 1

    sget-object v0, LI/n;->e:LI/n;

    iput-object v0, p0, LL/d;->e:LI/n;

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, LL/d;->e(I)V

    return-void
.end method

.method public final bridge containsKey(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, LD/k0;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    check-cast p1, LD/k0;

    invoke-virtual {p0, p1}, LL/d;->b(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final bridge containsValue(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, LD/O0;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    check-cast p1, LD/O0;

    invoke-super {p0, p1}, Ljava/util/AbstractMap;->containsValue(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final d(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    const/4 v0, 0x0

    iput-object v0, p0, LL/d;->f:Ljava/lang/Object;

    iget-object v0, p0, LL/d;->e:LI/n;

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    goto :goto_0

    :cond_0
    move v2, v1

    :goto_0
    invoke-virtual {v0, v2, p1, v1, p0}, LI/n;->n(ILjava/lang/Object;ILL/d;)LI/n;

    move-result-object p1

    if-nez p1, :cond_1

    sget-object p1, LI/n;->e:LI/n;

    :cond_1
    iput-object p1, p0, LL/d;->e:LI/n;

    iget-object p1, p0, LL/d;->f:Ljava/lang/Object;

    return-object p1
.end method

.method public final e(I)V
    .locals 0

    iput p1, p0, LL/d;->h:I

    iget p1, p0, LL/d;->g:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, LL/d;->g:I

    return-void
.end method

.method public final entrySet()Ljava/util/Set;
    .locals 2

    new-instance v0, LI/f;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, LI/f;-><init>(ILL/d;)V

    return-object v0
.end method

.method public final bridge get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    instance-of v0, p1, LD/k0;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    check-cast p1, LD/k0;

    invoke-virtual {p0, p1}, LL/d;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LD/O0;

    return-object p1
.end method

.method public final bridge getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    instance-of v0, p1, LD/k0;

    if-nez v0, :cond_0

    return-object p2

    :cond_0
    check-cast p1, LD/k0;

    check-cast p2, LD/O0;

    invoke-super {p0, p1, p2}, Ljava/util/AbstractMap;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LD/O0;

    return-object p1
.end method

.method public final keySet()Ljava/util/Set;
    .locals 2

    new-instance v0, LI/f;

    const/4 v1, 0x1

    invoke-direct {v0, v1, p0}, LI/f;-><init>(ILL/d;)V

    return-object v0
.end method

.method public final put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    const/4 v0, 0x0

    iput-object v0, p0, LL/d;->f:Ljava/lang/Object;

    iget-object v1, p0, LL/d;->e:LI/n;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    move v2, v0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :goto_1
    const/4 v5, 0x0

    move-object v3, p1

    move-object v4, p2

    move-object v6, p0

    invoke-virtual/range {v1 .. v6}, LI/n;->l(ILjava/lang/Object;Ljava/lang/Object;ILL/d;)LI/n;

    move-result-object p1

    iput-object p1, p0, LL/d;->e:LI/n;

    iget-object p1, p0, LL/d;->f:Ljava/lang/Object;

    return-object p1
.end method

.method public final putAll(Ljava/util/Map;)V
    .locals 6

    instance-of v0, p1, LI/c;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, LI/c;

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-nez v0, :cond_2

    instance-of v0, p1, LL/d;

    if-eqz v0, :cond_1

    move-object v0, p1

    check-cast v0, LL/d;

    goto :goto_1

    :cond_1
    move-object v0, v1

    :goto_1
    if-eqz v0, :cond_3

    invoke-virtual {v0}, LL/d;->a()LL/e;

    move-result-object v1

    goto :goto_2

    :cond_2
    move-object v1, v0

    :cond_3
    :goto_2
    if-eqz v1, :cond_4

    new-instance p1, LK/a;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p1, LK/a;->a:I

    iget v2, p0, LL/d;->h:I

    iget-object v3, p0, LL/d;->e:LI/n;

    const-string v4, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>"

    iget-object v5, v1, LI/c;->d:LI/n;

    invoke-static {v5, v4}, Lp2/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3, v5, v0, p1, p0}, LI/n;->m(LI/n;ILK/a;LL/d;)LI/n;

    move-result-object v0

    iput-object v0, p0, LL/d;->e:LI/n;

    iget v0, v1, LI/c;->e:I

    add-int/2addr v0, v2

    iget p1, p1, LK/a;->a:I

    sub-int/2addr v0, p1

    if-eq v2, v0, :cond_5

    invoke-virtual {p0, v0}, LL/d;->e(I)V

    goto :goto_3

    :cond_4
    invoke-super {p0, p1}, Ljava/util/AbstractMap;->putAll(Ljava/util/Map;)V

    :cond_5
    :goto_3
    return-void
.end method

.method public final bridge remove(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 4
    instance-of v0, p1, LD/k0;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    check-cast p1, LD/k0;

    .line 5
    invoke-virtual {p0, p1}, LL/d;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LD/O0;

    return-object p1
.end method

.method public final remove(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 8

    .line 1
    iget v0, p0, LL/d;->h:I

    .line 2
    iget-object v1, p0, LL/d;->e:LI/n;

    const/4 v7, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    goto :goto_0

    :cond_0
    move v2, v7

    :goto_0
    const/4 v5, 0x0

    move-object v3, p1

    move-object v4, p2

    move-object v6, p0

    invoke-virtual/range {v1 .. v6}, LI/n;->o(ILjava/lang/Object;Ljava/lang/Object;ILL/d;)LI/n;

    move-result-object p1

    if-nez p1, :cond_1

    sget-object p1, LI/n;->e:LI/n;

    :cond_1
    iput-object p1, p0, LL/d;->e:LI/n;

    .line 3
    iget p1, p0, LL/d;->h:I

    if-eq v0, p1, :cond_2

    const/4 v7, 0x1

    :cond_2
    return v7
.end method

.method public final size()I
    .locals 1

    iget v0, p0, LL/d;->h:I

    return v0
.end method

.method public final values()Ljava/util/Collection;
    .locals 1

    new-instance v0, LI/i;

    invoke-direct {v0, p0}, LI/i;-><init>(LL/d;)V

    return-object v0
.end method
