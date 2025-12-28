.class public abstract Lp2/f;
.super Lp2/b;
.source "SourceFile"

# interfaces
.implements Lp2/e;
.implements Lv2/a;
.implements Lc2/c;


# instance fields
.field public final j:I

.field public final k:I


# direct methods
.method public constructor <init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 7

    .line 1
    sget-object v2, Lp2/a;->d:Lp2/a;

    move-object v0, p0

    move v1, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move v6, p5

    invoke-direct/range {v0 .. v6}, Lp2/f;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method

.method public constructor <init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 8

    const/4 v0, 0x1

    and-int/2addr p6, v0

    const/4 v1, 0x0

    if-ne p6, v0, :cond_0

    move v7, v0

    goto :goto_0

    :cond_0
    move v7, v1

    :goto_0
    move-object v2, p0

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    .line 2
    invoke-direct/range {v2 .. v7}, Lp2/b;-><init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 3
    iput p1, p0, Lp2/f;->j:I

    .line 4
    iput v1, p0, Lp2/f;->k:I

    return-void
.end method


# virtual methods
.method public final b()Lv2/a;
    .locals 1

    sget-object v0, Lp2/p;->a:Lp2/q;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-object p0
.end method

.method public final e()I
    .locals 1

    iget v0, p0, Lp2/f;->j:I

    return v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lp2/f;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    check-cast p1, Lp2/f;

    iget-object v1, p1, Lp2/b;->g:Ljava/lang/String;

    iget-object v3, p0, Lp2/b;->g:Ljava/lang/String;

    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lp2/b;->h:Ljava/lang/String;

    iget-object v3, p1, Lp2/b;->h:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget v1, p0, Lp2/f;->k:I

    iget v3, p1, Lp2/f;->k:I

    if-ne v1, v3, :cond_1

    iget v1, p0, Lp2/f;->j:I

    iget v3, p1, Lp2/f;->j:I

    if-ne v1, v3, :cond_1

    iget-object v1, p0, Lp2/b;->e:Ljava/lang/Object;

    iget-object v3, p1, Lp2/b;->e:Ljava/lang/Object;

    invoke-static {v1, v3}, Lp2/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Lp2/b;->d()Lp2/c;

    move-result-object v1

    invoke-virtual {p1}, Lp2/b;->d()Lp2/c;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    move v0, v2

    :goto_0
    return v0

    :cond_2
    instance-of v0, p1, Lp2/f;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lp2/b;->d:Lv2/a;

    if-nez v0, :cond_3

    invoke-virtual {p0}, Lp2/f;->b()Lv2/a;

    iput-object p0, p0, Lp2/b;->d:Lv2/a;

    move-object v0, p0

    :cond_3
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_4
    return v2
.end method

.method public final hashCode()I
    .locals 2

    invoke-virtual {p0}, Lp2/b;->d()Lp2/c;

    invoke-virtual {p0}, Lp2/b;->d()Lp2/c;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lp2/b;->g:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lp2/b;->h:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lp2/b;->d:Lv2/a;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lp2/f;->b()Lv2/a;

    iput-object p0, p0, Lp2/b;->d:Lv2/a;

    move-object v0, p0

    :cond_0
    if-eq v0, p0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_1
    iget-object v0, p0, Lp2/b;->g:Ljava/lang/String;

    const-string v1, "<init>"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    const-string v0, "constructor (Kotlin reflection is not available)"

    goto :goto_0

    :cond_2
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "function "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " (Kotlin reflection is not available)"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0
.end method
