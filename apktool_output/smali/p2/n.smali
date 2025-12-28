.class public final Lp2/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field public d:I


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    iget v0, p0, Lp2/n;->d:I

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
