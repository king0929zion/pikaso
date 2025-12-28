.class public final LD/A0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LD/B0;

.field public final b:[I

.field public final c:I

.field public final d:[Ljava/lang/Object;

.field public final e:I

.field public f:Z

.field public g:I

.field public h:I

.field public i:I

.field public final j:LD/M;

.field public k:I

.field public l:I

.field public m:I

.field public n:Z


# direct methods
.method public constructor <init>(LD/B0;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LD/A0;->a:LD/B0;

    iget-object v0, p1, LD/B0;->d:[I

    iput-object v0, p0, LD/A0;->b:[I

    iget v0, p1, LD/B0;->e:I

    iput v0, p0, LD/A0;->c:I

    iget-object v1, p1, LD/B0;->f:[Ljava/lang/Object;

    iput-object v1, p0, LD/A0;->d:[Ljava/lang/Object;

    iget p1, p1, LD/B0;->g:I

    iput p1, p0, LD/A0;->e:I

    iput v0, p0, LD/A0;->h:I

    const/4 p1, -0x1

    iput p1, p0, LD/A0;->i:I

    new-instance p1, LD/M;

    invoke-direct {p1}, LD/M;-><init>()V

    iput-object p1, p0, LD/A0;->j:LD/M;

    return-void
.end method


# virtual methods
.method public final a(I)LD/c;
    .locals 3

    iget-object v0, p0, LD/A0;->a:LD/B0;

    iget-object v0, v0, LD/B0;->k:Ljava/util/ArrayList;

    iget v1, p0, LD/A0;->c:I

    invoke-static {v0, p1, v1}, LD/d;->F(Ljava/util/ArrayList;II)I

    move-result v1

    if-gez v1, :cond_0

    new-instance v2, LD/c;

    invoke-direct {v2, p1}, LD/c;-><init>(I)V

    add-int/lit8 v1, v1, 0x1

    neg-int p1, v1

    invoke-virtual {v0, p1, v2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    move-object v2, p1

    check-cast v2, LD/c;

    :goto_0
    return-object v2
.end method

.method public final b([II)Ljava/lang/Object;
    .locals 1

    invoke-static {p1, p2}, LD/d;->h([II)Z

    move-result v0

    if-eqz v0, :cond_1

    mul-int/lit8 p2, p2, 0x5

    array-length v0, p1

    if-lt p2, v0, :cond_0

    array-length p1, p1

    goto :goto_0

    :cond_0
    add-int/lit8 v0, p2, 0x4

    aget v0, p1, v0

    add-int/lit8 p2, p2, 0x1

    aget p1, p1, p2

    shr-int/lit8 p1, p1, 0x1d

    invoke-static {p1}, LD/d;->t(I)I

    move-result p1

    add-int/2addr p1, v0

    :goto_0
    iget-object p2, p0, LD/A0;->d:[Ljava/lang/Object;

    aget-object p1, p2, p1

    goto :goto_1

    :cond_1
    sget-object p1, LD/l;->a:LD/U;

    :goto_1
    return-object p1
.end method

.method public final c()V
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, LD/A0;->f:Z

    iget-object v0, p0, LD/A0;->a:LD/B0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v1, p0, LD/A0;->a:LD/B0;

    if-ne v1, v0, :cond_0

    iget v1, v0, LD/B0;->h:I

    if-lez v1, :cond_0

    add-int/lit8 v1, v1, -0x1

    iput v1, v0, LD/B0;->h:I

    return-void

    :cond_0
    const-string v0, "Unexpected reader close()"

    invoke-static {v0}, LD/d;->r(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final d()V
    .locals 6

    iget v0, p0, LD/A0;->k:I

    if-nez v0, :cond_5

    iget v0, p0, LD/A0;->g:I

    iget v1, p0, LD/A0;->h:I

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-ne v0, v1, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    if-eqz v0, :cond_4

    iget v0, p0, LD/A0;->i:I

    iget-object v1, p0, LD/A0;->b:[I

    invoke-static {v1, v0}, LD/d;->m([II)I

    move-result v0

    iput v0, p0, LD/A0;->i:I

    iget v4, p0, LD/A0;->c:I

    if-gez v0, :cond_1

    move v5, v4

    goto :goto_1

    :cond_1
    invoke-static {v1, v0}, LD/d;->g([II)I

    move-result v5

    add-int/2addr v5, v0

    :goto_1
    iput v5, p0, LD/A0;->h:I

    iget-object v5, p0, LD/A0;->j:LD/M;

    invoke-virtual {v5}, LD/M;->a()I

    move-result v5

    if-gez v5, :cond_2

    iput v2, p0, LD/A0;->l:I

    iput v2, p0, LD/A0;->m:I

    goto :goto_3

    :cond_2
    iput v5, p0, LD/A0;->l:I

    sub-int/2addr v4, v3

    if-lt v0, v4, :cond_3

    iget v0, p0, LD/A0;->e:I

    goto :goto_2

    :cond_3
    add-int/2addr v0, v3

    invoke-static {v1, v0}, LD/d;->f([II)I

    move-result v0

    :goto_2
    iput v0, p0, LD/A0;->m:I

    goto :goto_3

    :cond_4
    const-string v0, "endGroup() not called at the end of a group"

    invoke-static {v0}, LD/d;->r(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0

    :cond_5
    :goto_3
    return-void
.end method

.method public final e()Ljava/lang/Object;
    .locals 2

    iget v0, p0, LD/A0;->g:I

    iget v1, p0, LD/A0;->h:I

    if-ge v0, v1, :cond_0

    iget-object v1, p0, LD/A0;->b:[I

    invoke-virtual {p0, v1, v0}, LD/A0;->b([II)Ljava/lang/Object;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public final f()I
    .locals 2

    iget v0, p0, LD/A0;->g:I

    iget v1, p0, LD/A0;->h:I

    if-ge v0, v1, :cond_0

    mul-int/lit8 v0, v0, 0x5

    iget-object v1, p0, LD/A0;->b:[I

    aget v0, v1, v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final g(II)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, LD/A0;->b:[I

    invoke-static {v0, p1}, LD/d;->o([II)I

    move-result v1

    add-int/lit8 p1, p1, 0x1

    iget v2, p0, LD/A0;->c:I

    if-ge p1, v2, :cond_0

    mul-int/lit8 p1, p1, 0x5

    add-int/lit8 p1, p1, 0x4

    aget p1, v0, p1

    goto :goto_0

    :cond_0
    iget p1, p0, LD/A0;->e:I

    :goto_0
    add-int/2addr v1, p2

    if-ge v1, p1, :cond_1

    iget-object p1, p0, LD/A0;->d:[Ljava/lang/Object;

    aget-object p1, p1, v1

    goto :goto_1

    :cond_1
    sget-object p1, LD/l;->a:LD/U;

    :goto_1
    return-object p1
.end method

.method public final h()Ljava/lang/Object;
    .locals 2

    iget v0, p0, LD/A0;->k:I

    if-gtz v0, :cond_1

    iget v0, p0, LD/A0;->l:I

    iget v1, p0, LD/A0;->m:I

    if-lt v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    iput-boolean v1, p0, LD/A0;->n:Z

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, LD/A0;->l:I

    iget-object v1, p0, LD/A0;->d:[Ljava/lang/Object;

    aget-object v0, v1, v0

    return-object v0

    :cond_1
    :goto_0
    const/4 v0, 0x0

    iput-boolean v0, p0, LD/A0;->n:Z

    sget-object v0, LD/l;->a:LD/U;

    return-object v0
.end method

.method public final i(I)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LD/A0;->b:[I

    invoke-static {v0, p1}, LD/d;->j([II)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-static {v0, p1}, LD/d;->j([II)Z

    move-result v1

    if-eqz v1, :cond_0

    mul-int/lit8 p1, p1, 0x5

    add-int/lit8 p1, p1, 0x4

    aget p1, v0, p1

    iget-object v0, p0, LD/A0;->d:[Ljava/lang/Object;

    aget-object p1, v0, p1

    goto :goto_0

    :cond_0
    sget-object p1, LD/l;->a:LD/U;

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public final j([II)Ljava/lang/Object;
    .locals 2

    invoke-static {p1, p2}, LD/d;->i([II)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LD/A0;->d:[Ljava/lang/Object;

    mul-int/lit8 p2, p2, 0x5

    add-int/lit8 v1, p2, 0x4

    aget v1, p1, v1

    add-int/lit8 p2, p2, 0x1

    aget p1, p1, p2

    shr-int/lit8 p1, p1, 0x1e

    invoke-static {p1}, LD/d;->t(I)I

    move-result p1

    add-int/2addr p1, v1

    aget-object p1, v0, p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public final k(I)V
    .locals 3

    iget v0, p0, LD/A0;->k:I

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    if-eqz v0, :cond_3

    iput p1, p0, LD/A0;->g:I

    iget-object v0, p0, LD/A0;->b:[I

    iget v2, p0, LD/A0;->c:I

    if-ge p1, v2, :cond_1

    invoke-static {v0, p1}, LD/d;->m([II)I

    move-result p1

    goto :goto_1

    :cond_1
    const/4 p1, -0x1

    :goto_1
    iput p1, p0, LD/A0;->i:I

    if-gez p1, :cond_2

    iput v2, p0, LD/A0;->h:I

    goto :goto_2

    :cond_2
    invoke-static {v0, p1}, LD/d;->g([II)I

    move-result v0

    add-int/2addr v0, p1

    iput v0, p0, LD/A0;->h:I

    :goto_2
    iput v1, p0, LD/A0;->l:I

    iput v1, p0, LD/A0;->m:I

    return-void

    :cond_3
    const-string p1, "Cannot reposition while in an empty region"

    invoke-static {p1}, LD/d;->r(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final l()I
    .locals 3

    iget v0, p0, LD/A0;->k:I

    const/4 v1, 0x1

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_2

    iget v0, p0, LD/A0;->g:I

    iget-object v2, p0, LD/A0;->b:[I

    invoke-static {v2, v0}, LD/d;->j([II)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    iget v0, p0, LD/A0;->g:I

    invoke-static {v2, v0}, LD/d;->l([II)I

    move-result v1

    :goto_1
    iget v0, p0, LD/A0;->g:I

    invoke-static {v2, v0}, LD/d;->g([II)I

    move-result v2

    add-int/2addr v2, v0

    iput v2, p0, LD/A0;->g:I

    return v1

    :cond_2
    const-string v0, "Cannot skip while in an empty region"

    invoke-static {v0}, LD/d;->r(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final m()V
    .locals 2

    iget v0, p0, LD/A0;->k:I

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    if-eqz v0, :cond_1

    iget v0, p0, LD/A0;->h:I

    iput v0, p0, LD/A0;->g:I

    iput v1, p0, LD/A0;->l:I

    iput v1, p0, LD/A0;->m:I

    return-void

    :cond_1
    const-string v0, "Cannot skip the enclosing group while in an empty region"

    invoke-static {v0}, LD/d;->r(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final n()V
    .locals 6

    iget v0, p0, LD/A0;->k:I

    if-gtz v0, :cond_4

    iget v0, p0, LD/A0;->i:I

    iget v1, p0, LD/A0;->g:I

    iget-object v2, p0, LD/A0;->b:[I

    invoke-static {v2, v1}, LD/d;->m([II)I

    move-result v3

    const/4 v4, 0x1

    if-ne v3, v0, :cond_0

    move v0, v4

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_3

    iget v0, p0, LD/A0;->l:I

    iget v3, p0, LD/A0;->m:I

    iget-object v5, p0, LD/A0;->j:LD/M;

    if-nez v0, :cond_1

    if-nez v3, :cond_1

    const/4 v0, -0x1

    invoke-virtual {v5, v0}, LD/M;->b(I)V

    goto :goto_1

    :cond_1
    invoke-virtual {v5, v0}, LD/M;->b(I)V

    :goto_1
    iput v1, p0, LD/A0;->i:I

    invoke-static {v2, v1}, LD/d;->g([II)I

    move-result v0

    add-int/2addr v0, v1

    iput v0, p0, LD/A0;->h:I

    add-int/lit8 v0, v1, 0x1

    iput v0, p0, LD/A0;->g:I

    invoke-static {v2, v1}, LD/d;->o([II)I

    move-result v3

    iput v3, p0, LD/A0;->l:I

    iget v3, p0, LD/A0;->c:I

    sub-int/2addr v3, v4

    if-lt v1, v3, :cond_2

    iget v0, p0, LD/A0;->e:I

    goto :goto_2

    :cond_2
    invoke-static {v2, v0}, LD/d;->f([II)I

    move-result v0

    :goto_2
    iput v0, p0, LD/A0;->m:I

    goto :goto_3

    :cond_3
    const-string v0, "Invalid slot table detected"

    invoke-static {v0}, LD/d;->H(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0

    :cond_4
    :goto_3
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "SlotReader(current="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, LD/A0;->g:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", key="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LD/A0;->f()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", parent="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LD/A0;->i:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", end="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LD/A0;->h:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
