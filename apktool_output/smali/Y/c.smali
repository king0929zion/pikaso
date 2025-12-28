.class public abstract LY/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LG0/c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LG0/c;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-direct {v0, v1, v1}, LG0/c;-><init>(FF)V

    sput-object v0, LY/c;->a:LG0/c;

    return-void
.end method
