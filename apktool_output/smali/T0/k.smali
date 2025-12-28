.class public final Lt0/k;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LP/k;

.field public final b:Z

.field public final c:Ln0/z;

.field public final d:Lt0/g;

.field public e:Z

.field public f:Lt0/k;

.field public final g:I


# direct methods
.method public constructor <init>(LP/k;ZLn0/z;Lt0/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt0/k;->a:LP/k;

    iput-boolean p2, p0, Lt0/k;->b:Z

    iput-object p3, p0, Lt0/k;->c:Ln0/z;

    iput-object p4, p0, Lt0/k;->d:Lt0/g;

    iget p1, p3, Ln0/z;->e:I

    iput p1, p0, Lt0/k;->g:I

    return-void
.end method

.method public static synthetic h(Lt0/k;ZI)Ljava/util/List;
    .locals 2

    and-int/lit8 v0, p2, 0x1

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lt0/k;->b:Z

    xor-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    and-int/lit8 p2, p2, 0x2

    if-eqz p2, :cond_1

    move p1, v1

    :cond_1
    invoke-virtual {p0, v0, p1, v1}, Lt0/k;->g(ZZZ)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(Lt0/e;Lo2/c;)Lt0/k;
    .locals 5

    new-instance v0, Lt0/g;

    invoke-direct {v0}, Lt0/g;-><init>()V

    const/4 v1, 0x0

    iput-boolean v1, v0, Lt0/g;->e:Z

    iput-boolean v1, v0, Lt0/g;->f:Z

    invoke-interface {p2, v0}, Lo2/c;->i(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Lt0/k;

    new-instance v3, Lt0/i;

    invoke-direct {v3, p2}, Lt0/i;-><init>(Lo2/c;)V

    new-instance p2, Ln0/z;

    iget v4, p0, Lt0/k;->g:I

    if-eqz p1, :cond_0

    const p1, 0x3b9aca00

    :goto_0
    add-int/2addr v4, p1

    goto :goto_1

    :cond_0
    const p1, 0x77359400

    goto :goto_0

    :goto_1
    const/4 p1, 0x1

    invoke-direct {p2, v4, p1}, Ln0/z;-><init>(IZ)V

    invoke-direct {v2, v3, v1, p2, v0}, Lt0/k;-><init>(LP/k;ZLn0/z;Lt0/g;)V

    iput-boolean p1, v2, Lt0/k;->e:Z

    iput-object p0, v2, Lt0/k;->f:Lt0/k;

    return-object v2
.end method

.method public final b(Ln0/z;Ljava/util/ArrayList;Z)V
    .locals 5

    invoke-virtual {p1}, Ln0/z;->m()LF/d;

    move-result-object p1

    iget v0, p1, LF/d;->f:I

    if-lez v0, :cond_4

    iget-object p1, p1, LF/d;->d:[Ljava/lang/Object;

    const/4 v1, 0x0

    :cond_0
    aget-object v2, p1, v1

    check-cast v2, Ln0/z;

    invoke-virtual {v2}, Ln0/z;->u()Z

    move-result v3

    if-eqz v3, :cond_3

    if-nez p3, :cond_1

    iget-boolean v3, v2, Ln0/z;->E:Z

    if-nez v3, :cond_3

    :cond_1
    iget-object v3, v2, Ln0/z;->x:LD/s;

    const/16 v4, 0x8

    invoke-virtual {v3, v4}, LD/s;->f(I)Z

    move-result v3

    if-eqz v3, :cond_2

    iget-boolean v3, p0, Lt0/k;->b:Z

    invoke-static {v2, v3}, LZ0/d;->d(Ln0/z;Z)Lt0/k;

    move-result-object v2

    invoke-virtual {p2, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-virtual {p0, v2, p2, p3}, Lt0/k;->b(Ln0/z;Ljava/util/ArrayList;Z)V

    :cond_3
    :goto_0
    add-int/lit8 v1, v1, 0x1

    if-lt v1, v0, :cond_0

    :cond_4
    return-void
.end method

.method public final c()Ln0/Y;
    .locals 2

    iget-boolean v0, p0, Lt0/k;->e:Z

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lt0/k;->j()Lt0/k;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lt0/k;->c()Ln0/Y;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_1
    iget-object v0, p0, Lt0/k;->c:Ln0/z;

    invoke-static {v0}, LZ0/d;->y(Ln0/z;)Ln0/l0;

    move-result-object v0

    if-eqz v0, :cond_2

    goto :goto_1

    :cond_2
    iget-object v0, p0, Lt0/k;->a:LP/k;

    :goto_1
    const/16 v1, 0x8

    invoke-static {v0, v1}, Ln0/C;->p(Ln0/h;I)Ln0/Y;

    move-result-object v0

    return-object v0
.end method

.method public final d(Ljava/util/List;)V
    .locals 5

    const/4 v0, 0x0

    invoke-virtual {p0, v0, v0}, Lt0/k;->o(ZZ)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    :goto_0
    if-ge v0, v2, :cond_2

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lt0/k;

    invoke-virtual {v3}, Lt0/k;->l()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {p1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_0
    iget-object v4, v3, Lt0/k;->d:Lt0/g;

    iget-boolean v4, v4, Lt0/g;->f:Z

    if-nez v4, :cond_1

    invoke-virtual {v3, p1}, Lt0/k;->d(Ljava/util/List;)V

    :cond_1
    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public final e()LV/d;
    .locals 3

    invoke-virtual {p0}, Lt0/k;->c()Ln0/Y;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ln0/Y;->q0()LP/k;

    move-result-object v1

    iget-boolean v1, v1, LP/k;->p:Z

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    invoke-static {v0}, LZ0/d;->v(Ll0/g;)Ll0/g;

    move-result-object v1

    const/4 v2, 0x1

    invoke-interface {v1, v0, v2}, Ll0/g;->h(Ll0/g;Z)LV/d;

    move-result-object v0

    goto :goto_1

    :cond_1
    sget-object v0, LV/d;->e:LV/d;

    :goto_1
    return-object v0
.end method

.method public final f()LV/d;
    .locals 2

    invoke-virtual {p0}, Lt0/k;->c()Ln0/Y;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ln0/Y;->q0()LP/k;

    move-result-object v1

    iget-boolean v1, v1, LP/k;->p:Z

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    invoke-static {v0}, LZ0/d;->l(Ln0/Y;)LV/d;

    move-result-object v0

    goto :goto_1

    :cond_1
    sget-object v0, LV/d;->e:LV/d;

    :goto_1
    return-object v0
.end method

.method public final g(ZZZ)Ljava/util/List;
    .locals 0

    if-nez p1, :cond_0

    iget-object p1, p0, Lt0/k;->d:Lt0/g;

    iget-boolean p1, p1, Lt0/g;->f:Z

    if-eqz p1, :cond_0

    sget-object p1, Ld2/s;->d:Ld2/s;

    return-object p1

    :cond_0
    invoke-virtual {p0}, Lt0/k;->l()Z

    move-result p1

    if-eqz p1, :cond_1

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0, p1}, Lt0/k;->d(Ljava/util/List;)V

    return-object p1

    :cond_1
    invoke-virtual {p0, p2, p3}, Lt0/k;->o(ZZ)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final i()Lt0/g;
    .locals 3

    invoke-virtual {p0}, Lt0/k;->l()Z

    move-result v0

    iget-object v1, p0, Lt0/k;->d:Lt0/g;

    if-eqz v0, :cond_0

    new-instance v0, Lt0/g;

    invoke-direct {v0}, Lt0/g;-><init>()V

    iget-boolean v2, v1, Lt0/g;->e:Z

    iput-boolean v2, v0, Lt0/g;->e:Z

    iget-boolean v2, v1, Lt0/g;->f:Z

    iput-boolean v2, v0, Lt0/g;->f:Z

    iget-object v2, v0, Lt0/g;->d:Ljava/util/LinkedHashMap;

    iget-object v1, v1, Lt0/g;->d:Ljava/util/LinkedHashMap;

    invoke-interface {v2, v1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    invoke-virtual {p0, v0}, Lt0/k;->n(Lt0/g;)V

    return-object v0

    :cond_0
    return-object v1
.end method

.method public final j()Lt0/k;
    .locals 6

    iget-object v0, p0, Lt0/k;->f:Lt0/k;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    iget-object v1, p0, Lt0/k;->c:Ln0/z;

    iget-boolean v2, p0, Lt0/k;->b:Z

    if-eqz v2, :cond_2

    sget-object v3, Lt0/j;->e:Lt0/j;

    invoke-virtual {v1}, Ln0/z;->k()Ln0/z;

    move-result-object v4

    :goto_0
    if-eqz v4, :cond_2

    invoke-virtual {v3, v4}, Lt0/j;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Boolean;

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    if-eqz v5, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v4}, Ln0/z;->k()Ln0/z;

    move-result-object v4

    goto :goto_0

    :cond_2
    move-object v4, v0

    :goto_1
    if-nez v4, :cond_5

    invoke-virtual {v1}, Ln0/z;->k()Ln0/z;

    move-result-object v1

    :goto_2
    if-eqz v1, :cond_4

    const/16 v3, 0x8

    iget-object v4, v1, Ln0/z;->x:LD/s;

    invoke-virtual {v4, v3}, LD/s;->f(I)Z

    move-result v3

    if-eqz v3, :cond_3

    move-object v4, v1

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Ln0/z;->k()Ln0/z;

    move-result-object v1

    goto :goto_2

    :cond_4
    move-object v4, v0

    :cond_5
    :goto_3
    if-nez v4, :cond_6

    return-object v0

    :cond_6
    invoke-static {v4, v2}, LZ0/d;->d(Ln0/z;Z)Lt0/k;

    move-result-object v0

    return-object v0
.end method

.method public final k()Lt0/g;
    .locals 1

    iget-object v0, p0, Lt0/k;->d:Lt0/g;

    return-object v0
.end method

.method public final l()Z
    .locals 1

    iget-boolean v0, p0, Lt0/k;->b:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lt0/k;->d:Lt0/g;

    iget-boolean v0, v0, Lt0/g;->e:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final m()Z
    .locals 3

    iget-boolean v0, p0, Lt0/k;->e:Z

    if-nez v0, :cond_2

    const/4 v0, 0x4

    const/4 v1, 0x1

    invoke-static {p0, v1, v0}, Lt0/k;->h(Lt0/k;ZI)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lt0/k;->c:Ln0/z;

    invoke-virtual {v0}, Ln0/z;->k()Ln0/z;

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ln0/z;->i()Lt0/g;

    move-result-object v2

    if-eqz v2, :cond_0

    iget-boolean v2, v2, Lt0/g;->e:Z

    if-ne v2, v1, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {v0}, Ln0/z;->k()Ln0/z;

    move-result-object v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_1
    if-nez v0, :cond_2

    goto :goto_2

    :cond_2
    const/4 v1, 0x0

    :goto_2
    return v1
.end method

.method public final n(Lt0/g;)V
    .locals 10

    iget-object v0, p0, Lt0/k;->d:Lt0/g;

    iget-boolean v0, v0, Lt0/g;->f:Z

    if-nez v0, :cond_3

    const/4 v0, 0x0

    invoke-virtual {p0, v0, v0}, Lt0/k;->o(ZZ)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    :goto_0
    if-ge v0, v2, :cond_3

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lt0/k;

    invoke-virtual {v3}, Lt0/k;->l()Z

    move-result v4

    if-nez v4, :cond_2

    iget-object v4, v3, Lt0/k;->d:Lt0/g;

    iget-object v4, v4, Lt0/g;->d:Ljava/util/LinkedHashMap;

    invoke-virtual {v4}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_0
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/Map$Entry;

    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lt0/q;

    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v5

    iget-object v7, p1, Lt0/g;->d:Ljava/util/LinkedHashMap;

    invoke-virtual {v7, v6}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    const-string v9, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsPropertyKey<kotlin.Any?>"

    invoke-static {v6, v9}, Lp2/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v9, v6, Lt0/q;->b:Lo2/e;

    invoke-interface {v9, v8, v5}, Lo2/e;->h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    if-eqz v5, :cond_0

    invoke-interface {v7, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_1
    invoke-virtual {v3, p1}, Lt0/k;->n(Lt0/g;)V

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    return-void
.end method

.method public final o(ZZ)Ljava/util/List;
    .locals 5

    iget-boolean v0, p0, Lt0/k;->e:Z

    if-eqz v0, :cond_0

    sget-object p1, Ld2/s;->d:Ld2/s;

    return-object p1

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Lt0/k;->c:Ln0/z;

    invoke-virtual {p0, v1, v0, p2}, Lt0/k;->b(Ln0/z;Ljava/util/ArrayList;Z)V

    if-eqz p1, :cond_5

    sget-object p1, Lt0/n;->q:Lt0/q;

    iget-object p2, p0, Lt0/k;->d:Lt0/g;

    iget-object v1, p2, Lt0/g;->d:Ljava/util/LinkedHashMap;

    invoke-virtual {v1, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    const/4 v2, 0x0

    if-nez p1, :cond_1

    move-object p1, v2

    :cond_1
    check-cast p1, Lt0/e;

    if-eqz p1, :cond_2

    iget-boolean v3, p2, Lt0/g;->e:Z

    if-eqz v3, :cond_2

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_2

    new-instance v3, LD/y;

    const/16 v4, 0x16

    invoke-direct {v3, v4, p1}, LD/y;-><init>(ILjava/lang/Object;)V

    invoke-virtual {p0, p1, v3}, Lt0/k;->a(Lt0/e;Lo2/c;)Lt0/k;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2
    sget-object p1, Lt0/n;->a:Lt0/q;

    invoke-interface {v1, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_5

    iget-boolean p2, p2, Lt0/g;->e:Z

    if-eqz p2, :cond_5

    invoke-virtual {v1, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_3

    move-object p1, v2

    :cond_3
    check-cast p1, Ljava/util/List;

    if-eqz p1, :cond_4

    invoke-static {p1}, Ld2/k;->b0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    goto :goto_0

    :cond_4
    move-object p1, v2

    :goto_0
    if-eqz p1, :cond_5

    new-instance p2, Lq/B;

    const/4 v1, 0x1

    invoke-direct {p2, p1, v1}, Lq/B;-><init>(Ljava/lang/String;I)V

    invoke-virtual {p0, v2, p2}, Lt0/k;->a(Lt0/e;Lo2/c;)Lt0/k;

    move-result-object p1

    const/4 p2, 0x0

    invoke-virtual {v0, p2, p1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    :cond_5
    return-object v0
.end method
