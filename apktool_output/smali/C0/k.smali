.class public final LC0/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LD/L0;


# instance fields
.field public d:Z


# direct methods
.method public constructor <init>(Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, LC0/k;->d:Z

    return-void
.end method


# virtual methods
.method public getValue()Ljava/lang/Object;
    .locals 1

    iget-boolean v0, p0, LC0/k;->d:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
