.class public final LA0/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final synthetic g:I


# instance fields
.field public final a:Z

.field public final b:I

.field public final c:Z

.field public final d:I

.field public final e:I

.field public final f:LB0/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LA0/b;

    invoke-direct {v0}, LA0/b;-><init>()V

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    sget-object v0, LB0/c;->f:LB0/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v1, 0x0

    iput-boolean v1, p0, LA0/b;->a:Z

    iput v1, p0, LA0/b;->b:I

    const/4 v1, 0x1

    iput-boolean v1, p0, LA0/b;->c:Z

    iput v1, p0, LA0/b;->d:I

    iput v1, p0, LA0/b;->e:I

    iput-object v0, p0, LA0/b;->f:LB0/c;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LA0/b;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, LA0/b;

    iget-boolean v1, p1, LA0/b;->a:Z

    iget-boolean v3, p0, LA0/b;->a:Z

    if-eq v3, v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, LA0/b;->b:I

    iget v3, p1, LA0/b;->b:I

    invoke-static {v1, v3}, La/a;->u(II)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, LA0/b;->c:Z

    iget-boolean v3, p1, LA0/b;->c:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, LA0/b;->d:I

    iget v3, p1, LA0/b;->d:I

    invoke-static {v1, v3}, Lr2/a;->s(II)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget v1, p0, LA0/b;->e:I

    iget v3, p1, LA0/b;->e:I

    invoke-static {v1, v3}, LA0/a;->a(II)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    const/4 v1, 0x0

    invoke-static {v1, v1}, Lp2/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, LA0/b;->f:LB0/c;

    iget-object p1, p1, LA0/b;->f:LB0/c;

    invoke-static {v1, p1}, Lp2/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final hashCode()I
    .locals 3

    iget-boolean v0, p0, LA0/b;->a:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, LA0/b;->b:I

    invoke-static {v2, v0, v1}, LA/a;->a(III)I

    move-result v0

    iget-boolean v2, p0, LA0/b;->c:Z

    invoke-static {v2}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget v0, p0, LA0/b;->d:I

    invoke-static {v0, v2, v1}, LA/a;->a(III)I

    move-result v0

    iget v1, p0, LA0/b;->e:I

    const/16 v2, 0x3c1

    invoke-static {v1, v0, v2}, LA/a;->a(III)I

    move-result v0

    iget-object v1, p0, LA0/b;->f:LB0/c;

    iget-object v1, v1, LB0/c;->d:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 15

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "ImeOptions(singleLine="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-boolean v1, p0, LA0/b;->a:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", capitalization="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LA0/b;->b:I

    const/4 v2, -0x1

    invoke-static {v1, v2}, La/a;->u(II)Z

    move-result v3

    const-string v4, "None"

    const-string v5, "Unspecified"

    const/4 v6, 0x0

    const/4 v7, 0x1

    const/4 v8, 0x2

    const/4 v9, 0x3

    const-string v10, "Invalid"

    if-eqz v3, :cond_0

    move-object v1, v5

    goto :goto_0

    :cond_0
    invoke-static {v1, v6}, La/a;->u(II)Z

    move-result v3

    if-eqz v3, :cond_1

    move-object v1, v4

    goto :goto_0

    :cond_1
    invoke-static {v1, v7}, La/a;->u(II)Z

    move-result v3

    if-eqz v3, :cond_2

    const-string v1, "Characters"

    goto :goto_0

    :cond_2
    invoke-static {v1, v8}, La/a;->u(II)Z

    move-result v3

    if-eqz v3, :cond_3

    const-string v1, "Words"

    goto :goto_0

    :cond_3
    invoke-static {v1, v9}, La/a;->u(II)Z

    move-result v1

    if-eqz v1, :cond_4

    const-string v1, "Sentences"

    goto :goto_0

    :cond_4
    move-object v1, v10

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", autoCorrect="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, LA0/b;->c:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", keyboardType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LA0/b;->d:I

    invoke-static {v1, v6}, Lr2/a;->s(II)Z

    move-result v3

    const/4 v11, 0x7

    const/4 v12, 0x6

    const/4 v13, 0x5

    const/4 v14, 0x4

    if-eqz v3, :cond_5

    move-object v1, v5

    goto :goto_1

    :cond_5
    invoke-static {v1, v7}, Lr2/a;->s(II)Z

    move-result v3

    if-eqz v3, :cond_6

    const-string v1, "Text"

    goto :goto_1

    :cond_6
    invoke-static {v1, v8}, Lr2/a;->s(II)Z

    move-result v3

    if-eqz v3, :cond_7

    const-string v1, "Ascii"

    goto :goto_1

    :cond_7
    invoke-static {v1, v9}, Lr2/a;->s(II)Z

    move-result v3

    if-eqz v3, :cond_8

    const-string v1, "Number"

    goto :goto_1

    :cond_8
    invoke-static {v1, v14}, Lr2/a;->s(II)Z

    move-result v3

    if-eqz v3, :cond_9

    const-string v1, "Phone"

    goto :goto_1

    :cond_9
    invoke-static {v1, v13}, Lr2/a;->s(II)Z

    move-result v3

    if-eqz v3, :cond_a

    const-string v1, "Uri"

    goto :goto_1

    :cond_a
    invoke-static {v1, v12}, Lr2/a;->s(II)Z

    move-result v3

    if-eqz v3, :cond_b

    const-string v1, "Email"

    goto :goto_1

    :cond_b
    invoke-static {v1, v11}, Lr2/a;->s(II)Z

    move-result v3

    if-eqz v3, :cond_c

    const-string v1, "Password"

    goto :goto_1

    :cond_c
    const/16 v3, 0x8

    invoke-static {v1, v3}, Lr2/a;->s(II)Z

    move-result v3

    if-eqz v3, :cond_d

    const-string v1, "NumberPassword"

    goto :goto_1

    :cond_d
    const/16 v3, 0x9

    invoke-static {v1, v3}, Lr2/a;->s(II)Z

    move-result v1

    if-eqz v1, :cond_e

    const-string v1, "Decimal"

    goto :goto_1

    :cond_e
    move-object v1, v10

    :goto_1
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", imeAction="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LA0/b;->e:I

    invoke-static {v1, v2}, LA0/a;->a(II)Z

    move-result v2

    if-eqz v2, :cond_f

    move-object v4, v5

    goto :goto_2

    :cond_f
    invoke-static {v1, v6}, LA0/a;->a(II)Z

    move-result v2

    if-eqz v2, :cond_10

    goto :goto_2

    :cond_10
    invoke-static {v1, v7}, LA0/a;->a(II)Z

    move-result v2

    if-eqz v2, :cond_11

    const-string v4, "Default"

    goto :goto_2

    :cond_11
    invoke-static {v1, v8}, LA0/a;->a(II)Z

    move-result v2

    if-eqz v2, :cond_12

    const-string v4, "Go"

    goto :goto_2

    :cond_12
    invoke-static {v1, v9}, LA0/a;->a(II)Z

    move-result v2

    if-eqz v2, :cond_13

    const-string v4, "Search"

    goto :goto_2

    :cond_13
    invoke-static {v1, v14}, LA0/a;->a(II)Z

    move-result v2

    if-eqz v2, :cond_14

    const-string v4, "Send"

    goto :goto_2

    :cond_14
    invoke-static {v1, v13}, LA0/a;->a(II)Z

    move-result v2

    if-eqz v2, :cond_15

    const-string v4, "Previous"

    goto :goto_2

    :cond_15
    invoke-static {v1, v12}, LA0/a;->a(II)Z

    move-result v2

    if-eqz v2, :cond_16

    const-string v4, "Next"

    goto :goto_2

    :cond_16
    invoke-static {v1, v11}, LA0/a;->a(II)Z

    move-result v1

    if-eqz v1, :cond_17

    const-string v4, "Done"

    goto :goto_2

    :cond_17
    move-object v4, v10

    :goto_2
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", platformImeOptions=null, hintLocales="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LA0/b;->f:LB0/c;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
